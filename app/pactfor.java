package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactfor extends GXProcedure
{
   public pactfor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactfor.class ), "" );
   }

   public pactfor( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 )
   {
      pactfor.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pactfor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactfor.this.AV8CliCod = aP1[0];
      this.aP1 = aP1;
      pactfor.this.AV9ForSer = aP2[0];
      this.aP2 = aP2;
      pactfor.this.AV10ForColNom = aP3[0];
      this.aP3 = aP3;
      pactfor.this.AV11ForColNum = aP4[0];
      this.aP4 = aP4;
      pactfor.this.AV12TipColCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02Y92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV12TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P02Y92_A831TipColCod[0] ;
         A483ForColNum = P02Y92_A483ForColNum[0] ;
         A482ForColNom = P02Y92_A482ForColNom[0] ;
         A494ForSer = P02Y92_A494ForSer[0] ;
         A252CliCod = P02Y92_A252CliCod[0] ;
         A4339ForRGB = P02Y92_A4339ForRGB[0] ;
         n4339ForRGB = P02Y92_n4339ForRGB[0] ;
         A5337ForCodExt = P02Y92_A5337ForCodExt[0] ;
         n5337ForCodExt = P02Y92_n5337ForCodExt[0] ;
         A1191ForNomCli = P02Y92_A1191ForNomCli[0] ;
         n1191ForNomCli = P02Y92_n1191ForNomCli[0] ;
         A1192ForNumCli = P02Y92_A1192ForNumCli[0] ;
         n1192ForNumCli = P02Y92_n1192ForNumCli[0] ;
         A995ForTonal = P02Y92_A995ForTonal[0] ;
         n995ForTonal = P02Y92_n995ForTonal[0] ;
         A3315ForNumArc = P02Y92_A3315ForNumArc[0] ;
         n3315ForNumArc = P02Y92_n3315ForNumArc[0] ;
         A2838ForRelBan = P02Y92_A2838ForRelBan[0] ;
         n2838ForRelBan = P02Y92_n2838ForRelBan[0] ;
         A6379ForNomCli2 = P02Y92_A6379ForNomCli2[0] ;
         n6379ForNomCli2 = P02Y92_n6379ForNomCli2[0] ;
         A7029ForNomCli3 = P02Y92_A7029ForNomCli3[0] ;
         n7029ForNomCli3 = P02Y92_n7029ForNomCli3[0] ;
         A5362IntCodF = P02Y92_A5362IntCodF[0] ;
         n5362IntCodF = P02Y92_n5362IntCodF[0] ;
         A583IntCod = P02Y92_A583IntCod[0] ;
         A3560ForOpcCli = P02Y92_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P02Y92_n3560ForOpcCli[0] ;
         A3558ForFecApr = P02Y92_A3558ForFecApr[0] ;
         n3558ForFecApr = P02Y92_n3558ForFecApr[0] ;
         A626MatCod = P02Y92_A626MatCod[0] ;
         A3316CodSol = P02Y92_A3316CodSol[0] ;
         n3316CodSol = P02Y92_n3316CodSol[0] ;
         A484ForCon = P02Y92_A484ForCon[0] ;
         A2749ForPro = P02Y92_A2749ForPro[0] ;
         n2749ForPro = P02Y92_n2749ForPro[0] ;
         A3588ForEst = P02Y92_A3588ForEst[0] ;
         n3588ForEst = P02Y92_n3588ForEst[0] ;
         A486ForNumCol = P02Y92_A486ForNumCol[0] ;
         A485ForFec = P02Y92_A485ForFec[0] ;
         n485ForFec = P02Y92_n485ForFec[0] ;
         A129BarCod = P02Y92_A129BarCod[0] ;
         n129BarCod = P02Y92_n129BarCod[0] ;
         A132BarCodReo = P02Y92_A132BarCodReo[0] ;
         n132BarCodReo = P02Y92_n132BarCodReo[0] ;
         A130BarCodPar = P02Y92_A130BarCodPar[0] ;
         n130BarCodPar = P02Y92_n130BarCodPar[0] ;
         A495ForUltMod = P02Y92_A495ForUltMod[0] ;
         n495ForUltMod = P02Y92_n495ForUltMod[0] ;
         A1514MacProCod = P02Y92_A1514MacProCod[0] ;
         n1514MacProCod = P02Y92_n1514MacProCod[0] ;
         A1159ForUltLin = P02Y92_A1159ForUltLin[0] ;
         n1159ForUltLin = P02Y92_n1159ForUltLin[0] ;
         AV64ForRGB = A4339ForRGB ;
         AV13ForCodExt = A5337ForCodExt ;
         AV16ForNomCli = A1191ForNomCli ;
         AV15ForNumCli = A1192ForNumCli ;
         AV54ForTonal = A995ForTonal ;
         AV55ForNumArc = A3315ForNumArc ;
         AV51ForRelBan = A2838ForRelBan ;
         AV76ForNomCli2 = A6379ForNomCli2 ;
         AV79ForNomCli3 = A7029ForNomCli3 ;
         AV68IntCodF = A5362IntCodF ;
         AV23IntCod = A583IntCod ;
         AV67ForOpcCli = A3560ForOpcCli ;
         AV70ForFecApr = A3558ForFecApr ;
         AV25MatCod = A626MatCod ;
         AV56CodSol = A3316CodSol ;
         AV31ForCon = A484ForCon ;
         AV50ForPro = A2749ForPro ;
         AV61ForEst = A3588ForEst ;
         AV14ForNumCol = A486ForNumCol ;
         AV21ForFec = A485ForFec ;
         AV17BarCod = A129BarCod ;
         AV18BarCodReo = A132BarCodReo ;
         AV19BarCodPar = A130BarCodPar ;
         AV22ForUltMod = A495ForUltMod ;
         AV62MacProCod = A1514MacProCod ;
         AV49ForUltLin = A1159ForUltLin ;
         /* Execute user subroutine: 'ELIMINARLINEASEQUIVALENTES' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ACTUALIZARCABEZAR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = AV8CliCod ;
         GXv_char3[0] = AV9ForSer ;
         GXv_char4[0] = AV10ForColNom ;
         GXv_int5[0] = AV11ForColNum ;
         GXv_int6[0] = AV12TipColCod ;
         new app.paddlfor(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6) ;
         pactfor.this.A396EmprCod = GXv_char1[0] ;
         pactfor.this.AV8CliCod = GXv_int2[0] ;
         pactfor.this.AV9ForSer = GXv_char3[0] ;
         pactfor.this.AV10ForColNom = GXv_char4[0] ;
         pactfor.this.AV11ForColNum = GXv_int5[0] ;
         pactfor.this.AV12TipColCod = GXv_int6[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'ACTUALIZARCABEZAR' Routine */
      returnInSub = false ;
      n1159ForUltLin = false ;
      n1514MacProCod = false ;
      n495ForUltMod = false ;
      n130BarCodPar = false ;
      n132BarCodReo = false ;
      n129BarCod = false ;
      n485ForFec = false ;
      n3588ForEst = false ;
      n2749ForPro = false ;
      n3316CodSol = false ;
      n3558ForFecApr = false ;
      n3560ForOpcCli = false ;
      n5362IntCodF = false ;
      n7029ForNomCli3 = false ;
      n6379ForNomCli2 = false ;
      n2838ForRelBan = false ;
      n3315ForNumArc = false ;
      n995ForTonal = false ;
      n1192ForNumCli = false ;
      n1191ForNomCli = false ;
      n5337ForCodExt = false ;
      n4339ForRGB = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02Y93 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n1159ForUltLin), Short.valueOf(AV49ForUltLin), Boolean.valueOf(n1514MacProCod), AV62MacProCod, Boolean.valueOf(n495ForUltMod), AV22ForUltMod, Boolean.valueOf(n130BarCodPar), AV19BarCodPar, Boolean.valueOf(n132BarCodReo), Byte.valueOf(AV18BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(AV17BarCod), Boolean.valueOf(n485ForFec), AV21ForFec, Boolean.valueOf(n3588ForEst), AV61ForEst, Boolean.valueOf(n2749ForPro), AV50ForPro, Byte.valueOf(AV31ForCon), Boolean.valueOf(n3316CodSol), Short.valueOf(AV56CodSol), Short.valueOf(AV25MatCod), Boolean.valueOf(n3558ForFecApr), AV70ForFecApr, Boolean.valueOf(n3560ForOpcCli), AV67ForOpcCli, Byte.valueOf(AV23IntCod), Boolean.valueOf(n5362IntCodF), Byte.valueOf(AV68IntCodF), Boolean.valueOf(n7029ForNomCli3), AV79ForNomCli3, Boolean.valueOf(n6379ForNomCli2), AV76ForNomCli2, Boolean.valueOf(n2838ForRelBan), AV51ForRelBan, Boolean.valueOf(n3315ForNumArc), Integer.valueOf(AV55ForNumArc), Boolean.valueOf(n995ForTonal), AV54ForTonal, Boolean.valueOf(n1192ForNumCli), Integer.valueOf(AV15ForNumCli), Boolean.valueOf(n1191ForNomCli), AV16ForNomCli, Boolean.valueOf(n5337ForCodExt), AV13ForCodExt, Boolean.valueOf(n4339ForRGB), Long.valueOf(AV64ForRGB), A396EmprCod, Integer.valueOf(AV14ForNumCol), Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV12TipColCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
      /* End optimized UPDATE. */
   }

   public void S121( )
   {
      /* 'ELIMINARLINEASEQUIVALENTES' Routine */
      returnInSub = false ;
      /* Using cursor P02Y94 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV14ForNumCol), Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV12TipColCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A831TipColCod = P02Y94_A831TipColCod[0] ;
         A483ForColNum = P02Y94_A483ForColNum[0] ;
         A482ForColNom = P02Y94_A482ForColNom[0] ;
         A494ForSer = P02Y94_A494ForSer[0] ;
         A252CliCod = P02Y94_A252CliCod[0] ;
         A486ForNumCol = P02Y94_A486ForNumCol[0] ;
         /* Optimized DELETE. */
         /* Using cursor P02Y95 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
         /* End optimized DELETE. */
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactfor.this.A396EmprCod;
      this.aP1[0] = pactfor.this.AV8CliCod;
      this.aP2[0] = pactfor.this.AV9ForSer;
      this.aP3[0] = pactfor.this.AV10ForColNom;
      this.aP4[0] = pactfor.this.AV11ForColNum;
      this.aP5[0] = pactfor.this.AV12TipColCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactfor");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P02Y92_A396EmprCod = new String[] {""} ;
      P02Y92_A831TipColCod = new byte[1] ;
      P02Y92_A483ForColNum = new int[1] ;
      P02Y92_A482ForColNom = new String[] {""} ;
      P02Y92_A494ForSer = new String[] {""} ;
      P02Y92_A252CliCod = new int[1] ;
      P02Y92_A4339ForRGB = new long[1] ;
      P02Y92_n4339ForRGB = new boolean[] {false} ;
      P02Y92_A5337ForCodExt = new String[] {""} ;
      P02Y92_n5337ForCodExt = new boolean[] {false} ;
      P02Y92_A1191ForNomCli = new String[] {""} ;
      P02Y92_n1191ForNomCli = new boolean[] {false} ;
      P02Y92_A1192ForNumCli = new int[1] ;
      P02Y92_n1192ForNumCli = new boolean[] {false} ;
      P02Y92_A995ForTonal = new String[] {""} ;
      P02Y92_n995ForTonal = new boolean[] {false} ;
      P02Y92_A3315ForNumArc = new int[1] ;
      P02Y92_n3315ForNumArc = new boolean[] {false} ;
      P02Y92_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Y92_n2838ForRelBan = new boolean[] {false} ;
      P02Y92_A6379ForNomCli2 = new String[] {""} ;
      P02Y92_n6379ForNomCli2 = new boolean[] {false} ;
      P02Y92_A7029ForNomCli3 = new String[] {""} ;
      P02Y92_n7029ForNomCli3 = new boolean[] {false} ;
      P02Y92_A5362IntCodF = new byte[1] ;
      P02Y92_n5362IntCodF = new boolean[] {false} ;
      P02Y92_A583IntCod = new byte[1] ;
      P02Y92_A3560ForOpcCli = new String[] {""} ;
      P02Y92_n3560ForOpcCli = new boolean[] {false} ;
      P02Y92_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      P02Y92_n3558ForFecApr = new boolean[] {false} ;
      P02Y92_A626MatCod = new short[1] ;
      P02Y92_A3316CodSol = new short[1] ;
      P02Y92_n3316CodSol = new boolean[] {false} ;
      P02Y92_A484ForCon = new byte[1] ;
      P02Y92_A2749ForPro = new String[] {""} ;
      P02Y92_n2749ForPro = new boolean[] {false} ;
      P02Y92_A3588ForEst = new String[] {""} ;
      P02Y92_n3588ForEst = new boolean[] {false} ;
      P02Y92_A486ForNumCol = new int[1] ;
      P02Y92_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02Y92_n485ForFec = new boolean[] {false} ;
      P02Y92_A129BarCod = new int[1] ;
      P02Y92_n129BarCod = new boolean[] {false} ;
      P02Y92_A132BarCodReo = new byte[1] ;
      P02Y92_n132BarCodReo = new boolean[] {false} ;
      P02Y92_A130BarCodPar = new String[] {""} ;
      P02Y92_n130BarCodPar = new boolean[] {false} ;
      P02Y92_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P02Y92_n495ForUltMod = new boolean[] {false} ;
      P02Y92_A1514MacProCod = new String[] {""} ;
      P02Y92_n1514MacProCod = new boolean[] {false} ;
      P02Y92_A1159ForUltLin = new short[1] ;
      P02Y92_n1159ForUltLin = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A5337ForCodExt = "" ;
      A1191ForNomCli = "" ;
      A995ForTonal = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A6379ForNomCli2 = "" ;
      A7029ForNomCli3 = "" ;
      A3560ForOpcCli = "" ;
      A3558ForFecApr = GXutil.nullDate() ;
      A2749ForPro = "" ;
      A3588ForEst = "" ;
      A485ForFec = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A495ForUltMod = GXutil.nullDate() ;
      A1514MacProCod = "" ;
      AV13ForCodExt = "" ;
      AV16ForNomCli = "" ;
      AV54ForTonal = "" ;
      AV51ForRelBan = DecimalUtil.ZERO ;
      AV76ForNomCli2 = "" ;
      AV79ForNomCli3 = "" ;
      AV67ForOpcCli = "" ;
      AV70ForFecApr = GXutil.nullDate() ;
      AV50ForPro = "" ;
      AV61ForEst = "" ;
      AV21ForFec = GXutil.nullDate() ;
      AV19BarCodPar = "" ;
      AV22ForUltMod = GXutil.nullDate() ;
      AV62MacProCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      P02Y94_A396EmprCod = new String[] {""} ;
      P02Y94_A831TipColCod = new byte[1] ;
      P02Y94_A483ForColNum = new int[1] ;
      P02Y94_A482ForColNom = new String[] {""} ;
      P02Y94_A494ForSer = new String[] {""} ;
      P02Y94_A252CliCod = new int[1] ;
      P02Y94_A486ForNumCol = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactfor__default(),
         new Object[] {
             new Object[] {
            P02Y92_A396EmprCod, P02Y92_A831TipColCod, P02Y92_A483ForColNum, P02Y92_A482ForColNom, P02Y92_A494ForSer, P02Y92_A252CliCod, P02Y92_A4339ForRGB, P02Y92_n4339ForRGB, P02Y92_A5337ForCodExt, P02Y92_n5337ForCodExt,
            P02Y92_A1191ForNomCli, P02Y92_n1191ForNomCli, P02Y92_A1192ForNumCli, P02Y92_n1192ForNumCli, P02Y92_A995ForTonal, P02Y92_n995ForTonal, P02Y92_A3315ForNumArc, P02Y92_n3315ForNumArc, P02Y92_A2838ForRelBan, P02Y92_n2838ForRelBan,
            P02Y92_A6379ForNomCli2, P02Y92_n6379ForNomCli2, P02Y92_A7029ForNomCli3, P02Y92_n7029ForNomCli3, P02Y92_A5362IntCodF, P02Y92_n5362IntCodF, P02Y92_A583IntCod, P02Y92_A3560ForOpcCli, P02Y92_n3560ForOpcCli, P02Y92_A3558ForFecApr,
            P02Y92_n3558ForFecApr, P02Y92_A626MatCod, P02Y92_A3316CodSol, P02Y92_n3316CodSol, P02Y92_A484ForCon, P02Y92_A2749ForPro, P02Y92_n2749ForPro, P02Y92_A3588ForEst, P02Y92_n3588ForEst, P02Y92_A486ForNumCol,
            P02Y92_A485ForFec, P02Y92_n485ForFec, P02Y92_A129BarCod, P02Y92_n129BarCod, P02Y92_A132BarCodReo, P02Y92_n132BarCodReo, P02Y92_A130BarCodPar, P02Y92_n130BarCodPar, P02Y92_A495ForUltMod, P02Y92_n495ForUltMod,
            P02Y92_A1514MacProCod, P02Y92_n1514MacProCod, P02Y92_A1159ForUltLin, P02Y92_n1159ForUltLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02Y94_A396EmprCod, P02Y94_A831TipColCod, P02Y94_A483ForColNum, P02Y94_A482ForColNom, P02Y94_A494ForSer, P02Y94_A252CliCod, P02Y94_A486ForNumCol
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TipColCod ;
   private byte A831TipColCod ;
   private byte A5362IntCodF ;
   private byte A583IntCod ;
   private byte A484ForCon ;
   private byte A132BarCodReo ;
   private byte AV68IntCodF ;
   private byte AV23IntCod ;
   private byte AV31ForCon ;
   private byte AV18BarCodReo ;
   private byte GXv_int6[] ;
   private short A626MatCod ;
   private short A3316CodSol ;
   private short A1159ForUltLin ;
   private short AV25MatCod ;
   private short AV56CodSol ;
   private short AV49ForUltLin ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int AV11ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A1192ForNumCli ;
   private int A3315ForNumArc ;
   private int A486ForNumCol ;
   private int A129BarCod ;
   private int AV15ForNumCli ;
   private int AV55ForNumArc ;
   private int AV14ForNumCol ;
   private int AV17BarCod ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private long A4339ForRGB ;
   private long AV64ForRGB ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal AV51ForRelBan ;
   private String A396EmprCod ;
   private String AV9ForSer ;
   private String AV10ForColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A5337ForCodExt ;
   private String A1191ForNomCli ;
   private String A995ForTonal ;
   private String A6379ForNomCli2 ;
   private String A7029ForNomCli3 ;
   private String A3560ForOpcCli ;
   private String A2749ForPro ;
   private String A3588ForEst ;
   private String A130BarCodPar ;
   private String A1514MacProCod ;
   private String AV13ForCodExt ;
   private String AV16ForNomCli ;
   private String AV54ForTonal ;
   private String AV76ForNomCli2 ;
   private String AV79ForNomCli3 ;
   private String AV67ForOpcCli ;
   private String AV50ForPro ;
   private String AV61ForEst ;
   private String AV19BarCodPar ;
   private String AV62MacProCod ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private java.util.Date A3558ForFecApr ;
   private java.util.Date A485ForFec ;
   private java.util.Date A495ForUltMod ;
   private java.util.Date AV70ForFecApr ;
   private java.util.Date AV21ForFec ;
   private java.util.Date AV22ForUltMod ;
   private boolean n4339ForRGB ;
   private boolean n5337ForCodExt ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean n995ForTonal ;
   private boolean n3315ForNumArc ;
   private boolean n2838ForRelBan ;
   private boolean n6379ForNomCli2 ;
   private boolean n7029ForNomCli3 ;
   private boolean n5362IntCodF ;
   private boolean n3560ForOpcCli ;
   private boolean n3558ForFecApr ;
   private boolean n3316CodSol ;
   private boolean n2749ForPro ;
   private boolean n3588ForEst ;
   private boolean n485ForFec ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n495ForUltMod ;
   private boolean n1514MacProCod ;
   private boolean n1159ForUltLin ;
   private boolean returnInSub ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02Y92_A396EmprCod ;
   private byte[] P02Y92_A831TipColCod ;
   private int[] P02Y92_A483ForColNum ;
   private String[] P02Y92_A482ForColNom ;
   private String[] P02Y92_A494ForSer ;
   private int[] P02Y92_A252CliCod ;
   private long[] P02Y92_A4339ForRGB ;
   private boolean[] P02Y92_n4339ForRGB ;
   private String[] P02Y92_A5337ForCodExt ;
   private boolean[] P02Y92_n5337ForCodExt ;
   private String[] P02Y92_A1191ForNomCli ;
   private boolean[] P02Y92_n1191ForNomCli ;
   private int[] P02Y92_A1192ForNumCli ;
   private boolean[] P02Y92_n1192ForNumCli ;
   private String[] P02Y92_A995ForTonal ;
   private boolean[] P02Y92_n995ForTonal ;
   private int[] P02Y92_A3315ForNumArc ;
   private boolean[] P02Y92_n3315ForNumArc ;
   private java.math.BigDecimal[] P02Y92_A2838ForRelBan ;
   private boolean[] P02Y92_n2838ForRelBan ;
   private String[] P02Y92_A6379ForNomCli2 ;
   private boolean[] P02Y92_n6379ForNomCli2 ;
   private String[] P02Y92_A7029ForNomCli3 ;
   private boolean[] P02Y92_n7029ForNomCli3 ;
   private byte[] P02Y92_A5362IntCodF ;
   private boolean[] P02Y92_n5362IntCodF ;
   private byte[] P02Y92_A583IntCod ;
   private String[] P02Y92_A3560ForOpcCli ;
   private boolean[] P02Y92_n3560ForOpcCli ;
   private java.util.Date[] P02Y92_A3558ForFecApr ;
   private boolean[] P02Y92_n3558ForFecApr ;
   private short[] P02Y92_A626MatCod ;
   private short[] P02Y92_A3316CodSol ;
   private boolean[] P02Y92_n3316CodSol ;
   private byte[] P02Y92_A484ForCon ;
   private String[] P02Y92_A2749ForPro ;
   private boolean[] P02Y92_n2749ForPro ;
   private String[] P02Y92_A3588ForEst ;
   private boolean[] P02Y92_n3588ForEst ;
   private int[] P02Y92_A486ForNumCol ;
   private java.util.Date[] P02Y92_A485ForFec ;
   private boolean[] P02Y92_n485ForFec ;
   private int[] P02Y92_A129BarCod ;
   private boolean[] P02Y92_n129BarCod ;
   private byte[] P02Y92_A132BarCodReo ;
   private boolean[] P02Y92_n132BarCodReo ;
   private String[] P02Y92_A130BarCodPar ;
   private boolean[] P02Y92_n130BarCodPar ;
   private java.util.Date[] P02Y92_A495ForUltMod ;
   private boolean[] P02Y92_n495ForUltMod ;
   private String[] P02Y92_A1514MacProCod ;
   private boolean[] P02Y92_n1514MacProCod ;
   private short[] P02Y92_A1159ForUltLin ;
   private boolean[] P02Y92_n1159ForUltLin ;
   private String[] P02Y94_A396EmprCod ;
   private byte[] P02Y94_A831TipColCod ;
   private int[] P02Y94_A483ForColNum ;
   private String[] P02Y94_A482ForColNom ;
   private String[] P02Y94_A494ForSer ;
   private int[] P02Y94_A252CliCod ;
   private int[] P02Y94_A486ForNumCol ;
}

final  class pactfor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02Y92", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForRGB, ForCodExt, ForNomCli, ForNumCli, ForTonal, ForNumArc, ForRelBan, ForNomCli2, ForNomCli3, IntCodF, IntCod, ForOpcCli, ForFecApr, MatCod, CodSol, ForCon, ForPro, ForEst, ForNumCol, ForFec, BarCod, BarCodReo, BarCodPar, ForUltMod, MacProCod, ForUltLin FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02Y93", "UPDATE TXPCFORMU SET ForUltLin=?, MacProCod=?, ForUltMod=?, BarCodPar=?, BarCodReo=?, BarCod=?, ForFec=?, ForEst=?, ForPro=?, ForCon=?, CodSol=?, MatCod=?, ForFecApr=?, ForOpcCli=?, IntCod=?, IntCodF=?, ForNomCli3=?, ForNomCli2=?, ForRelBan=?, ForNumArc=?, ForTonal=?, ForNumCli=?, ForNomCli=?, ForCodExt=?, ForRGB=?  WHERE (EmprCod = ? and ForNumCol = ?) AND (CliCod <> ? or ForSer <> ? or ForColNom <> ? or ForColNum <> ? or TipColCod <> ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
         ,new ForEachCursor("P02Y94", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol FROM TXPCFORMU WHERE (EmprCod = ? and ForNumCol = ?) AND (CliCod <> ? or ForSer <> ? or ForColNom <> ? or ForColNum <> ? or TipColCod <> ?) ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02Y95", "DELETE FROM TXPLFORMU  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(17);
               ((String[]) buf[27])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(20);
               ((short[]) buf[32])[0] = rslt.getShort(21);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(22);
               ((String[]) buf[35])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(25);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(26);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(27);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((byte[]) buf[44])[0] = rslt.getByte(28);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[48])[0] = rslt.getGXDate(30);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(31, 6);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((short[]) buf[52])[0] = rslt.getShort(32);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 6);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 1);
               }
               stmt.setByte(10, ((Number) parms[18]).byteValue());
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[20]).shortValue());
               }
               stmt.setShort(12, ((Number) parms[21]).shortValue());
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DATE );
               }
               else
               {
                  stmt.setDate(13, (java.util.Date)parms[23]);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[25], 1);
               }
               stmt.setByte(15, ((Number) parms[26]).byteValue());
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[28]).byteValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[30], 30);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[32], 20);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[36]).intValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[38], 20);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[40]).intValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[42], 13);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[44], 2);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(25, ((Number) parms[46]).longValue());
               }
               stmt.setString(26, (String)parms[47], 3);
               stmt.setInt(27, ((Number) parms[48]).intValue());
               stmt.setInt(28, ((Number) parms[49]).intValue());
               stmt.setString(29, (String)parms[50], 16);
               stmt.setString(30, (String)parms[51], 13);
               stmt.setInt(31, ((Number) parms[52]).intValue());
               stmt.setByte(32, ((Number) parms[53]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

