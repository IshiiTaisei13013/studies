# studies
- 勉強用のリポジトリです
- ブランチごとに何かしらの課題を書きました。

# CUIゲーム
- w,a,s,dで移動するだけのゲーム
- w,enterと入力すると上に移動する
- プレイヤーは「@」、壁は「■」であらわす
- 今のところ死なないので、強制終了して終わってください

## Actorオブジェクト
- 場所を保持するだけのもの

## Creatureオブジェクト
- Actorを継承
- 名前、ステータスを持ち移動するもの
- 移動と当たり判定はここで行っている

## Playerオブジェクト
- Creatureを継承
- 今のところあんまり意味がない
