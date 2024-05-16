package example.palletes

import com.jakewharton.mosaic.ui.Color
import example.RrtopColorsPalette

private val Black = Color(0, 0, 0)
private val White = Color(211, 215, 207)
private val DarkGray = Color(104, 106, 113)
private val Blue = Color(114, 159, 207)
private val Green = Color(78, 154, 6)
private val Red = Color(204, 0, 0)
private val Gray = Color(128, 128, 128)
private val Cyan = Color(6, 152, 154)

val DefaultColorsPalette = RrtopColorsPalette(
	mainBg = Black,
	menuBg = Black,
	menuFg = DarkGray,
	menuDividerFg = DarkGray,
	menuHighlightBg = Black,
	menuHighlightFg = Blue,
	statusBarFg = DarkGray,
	memoryTitleFg = White,
	memoryBorderFg = DarkGray,
	memoryMaxMemoryTextFg = Blue,
	memoryUsedMemoryTextFg = Blue,
	memoryUsedMemorySparklineFg = Blue,
	memoryUsedMemorySparklineBaselineFg = DarkGray,
	memoryFragRatioTextFg = Green,
	memoryRssMemoryTextFg = Green,
	memoryRssMemorySparklineFg = Green,
	memoryRssMemorySparklineBaselineFg = DarkGray,
	cpuTitleFg = White,
	cpuBorderFg = DarkGray,
	cpuChartLineFg = DarkGray,
	cpuChartAxisFg = DarkGray,
	cpuSysCpuText1Fg = White,
	cpuSysCpuText2Fg = Red,
	cpuSysCpuDatasetFg = Red,
	cpuUserCpuText1Fg = White,
	cpuUserCpuText2Fg = Green,
	cpuUserCpuDatasetFg = Green,
	throughputTitleFg = White,
	throughputBorderFg = DarkGray,
	throughputTotalCommandsTextFg = Blue,
	throughputOpsTextFg = Blue,
	throughputSparklineFg = Blue,
	throughputSparklineBaselineFg = DarkGray,
	networkTitleFg = White,
	networkBorderFg = DarkGray,
	networkRxTotalTextFg = Red,
	networkRxSTextFg = Red,
	networkRxSparklineFg = Red,
	networkRxSparklineBaselineFg = DarkGray,
	networkTxTotalTextFg = Blue,
	networkTxSTextFg = Blue,
	networkTxSparklineFg = Blue,
	networkTxSparklineBaselineFg = DarkGray,
	statTitleFg = White,
	statBorderFg = DarkGray,
	statTableHeaderFg = Cyan,
	statTableRowGaugeFg = Blue,
	statTableRowGaugeBg = Gray,
	statTableRowTop1Fg = White,
	statTableRowTop2Fg = Blue,
	statTableRowHighlightBg = DarkGray,
	callsTitleFg = White,
	callsBorderFg = DarkGray,
	callsTableHeaderFg = Cyan,
	callsTableRowGaugeFg = Blue,
	callsTableRowGaugeBg = Gray,
	callsTableRowTop1Fg = White,
	callsTableRowTop2Fg = Blue,
	callsTableRowHighlightBg = DarkGray,
	rawTitleFg = White,
	rawBorderFg = DarkGray,
	rawTableHeaderFg = Cyan,
	rawTableRowTop1Fg = White,
	rawTableRowTop2Fg = Blue,
	rawTableRowHighlightBg = DarkGray,
	slowTitleFg = White,
	slowBorderFg = DarkGray,
	slowTableHeaderFg = Cyan,
	slowTableRowTop1Fg = White,
	slowTableRowTop2Fg = Blue,
	slowTableRowHighlightBg = DarkGray,
)
