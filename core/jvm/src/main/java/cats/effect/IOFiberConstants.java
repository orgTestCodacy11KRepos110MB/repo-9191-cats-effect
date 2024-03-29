/*
 * Copyright 2020-2021 Typelevel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cats.effect;

// defined in Java since Scala doesn't let us define static fields
final class IOFiberConstants {

  public static final int MaxStackDepth = 512;

  // continuation ids (should all be inlined)
  public static final byte MapK = 0;
  public static final byte FlatMapK = 1;
  public static final byte CancelationLoopK = 2;
  public static final byte RunTerminusK = 3;
  public static final byte EvalOnK = 4;
  public static final byte HandleErrorWithK = 5;
  public static final byte OnCancelK = 6;
  public static final byte UncancelableK = 7;
  public static final byte UnmaskK = 8;
  public static final byte AttemptK = 9;

  // resume ids
  public static final byte ExecR = 0;
  public static final byte AsyncContinueSuccessfulR = 1;
  public static final byte AsyncContinueFailedR = 2;
  public static final byte BlockingR = 3;
  public static final byte AfterBlockingSuccessfulR = 4;
  public static final byte AfterBlockingFailedR = 5;
  public static final byte EvalOnR = 6;
  public static final byte CedeR = 7;
  public static final byte AutoCedeR = 8;
  public static final byte DoneR = 9;

  // ContState tags
  public static final int ContStateInitial = 0;
  public static final int ContStateWaiting = 1;
  public static final int ContStateWinner = 2;
  public static final int ContStateResult = 3;
}
