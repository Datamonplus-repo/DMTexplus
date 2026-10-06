package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptosa01 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptosa01 pgm = new aptosa01 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptosa01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptosa01.class ), "" );
   }

   public aptosa01( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV21Emprcod = "001" ;
      AV22Maqcodi = httpContext.getMessage( "ACAB  ", "") ;
      AV25Maqcodf = httpContext.getMessage( "ACAB99", "") ;
      Gx_msg = httpContext.getMessage( "Procesando Maquinas ACAB", "") ;
      System.out.println( Gx_msg );
      /* Using cursor P03ZN2 */
      pr_default.execute(0, new Object[] {AV21Emprcod, AV22Maqcodi, AV23Fec1, AV24Fec2, AV25Maqcodf});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P03ZN2_A130BarCodPar[0] ;
         A132BarCodReo = P03ZN2_A132BarCodReo[0] ;
         A129BarCod = P03ZN2_A129BarCod[0] ;
         A396EmprCod = P03ZN2_A396EmprCod[0] ;
         A558HisProFec = P03ZN2_A558HisProFec[0] ;
         A602MaqCod = P03ZN2_A602MaqCod[0] ;
         A561HisProLin = P03ZN2_A561HisProLin[0] ;
         A194BarOrdLin = P03ZN2_A194BarOrdLin[0] ;
         AV26Hisprolin = A561HisProLin ;
         AV27Maqcod = A602MaqCod ;
         AV34Maqcod4 = GXutil.substring( A602MaqCod, 1, 4) ;
         AV28Hisprofec = A558HisProFec ;
         AV29Barcod = A129BarCod ;
         AV30Barcodreo = A132BarCodReo ;
         AV31Barcodpar = A130BarCodPar ;
         AV33Barordlin = A194BarOrdLin ;
         AV32Procod = " " ;
         /* Using cursor P03ZN3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A761ProFasLin = P03ZN3_A761ProFasLin[0] ;
            n761ProFasLin = P03ZN3_n761ProFasLin[0] ;
            A758ProCod = P03ZN3_A758ProCod[0] ;
            AV32Procod = A758ProCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Execute user subroutine: 'ABRIR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gx_msg = httpContext.getMessage( "Fin Procesando Maquinas ACAB.Tablas CAAB00/CAAB01", "") ;
      httpContext.GX_msglist.addItem(Gx_msg);
      cleanup();
   }

   public void S111( )
   {
      /* 'ABRIR' Routine */
      returnInSub = false ;
      /* Using cursor P03ZN4 */
      pr_default.execute(2, new Object[] {AV21Emprcod, Integer.valueOf(AV29Barcod), Byte.valueOf(AV30Barcodreo), AV31Barcodpar, Short.valueOf(AV33Barordlin), AV34Maqcod4});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P03ZN4_A396EmprCod[0] ;
         A129BarCod = P03ZN4_A129BarCod[0] ;
         A132BarCodReo = P03ZN4_A132BarCodReo[0] ;
         A130BarCodPar = P03ZN4_A130BarCodPar[0] ;
         A194BarOrdLin = P03ZN4_A194BarOrdLin[0] ;
         A9940Ab_cod = P03ZN4_A9940Ab_cod[0] ;
         A758ProCod = P03ZN4_A758ProCod[0] ;
         A9960Ab_ult = P03ZN4_A9960Ab_ult[0] ;
         n9960Ab_ult = P03ZN4_n9960Ab_ult[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPCAAB00

         */
         W396EmprCod = A396EmprCod ;
         W602MaqCod = A602MaqCod ;
         A602MaqCod = AV27Maqcod ;
         A558HisProFec = AV28Hisprofec ;
         A561HisProLin = AV26Hisprolin ;
         A10486Abh_cod = A9940Ab_cod ;
         A10480Abh_ult = A9960Ab_ult ;
         /* Using cursor P03ZN5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod, Integer.valueOf(A10480Abh_ult)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAAB00");
         if ( (pr_default.getStatus(3) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A602MaqCod = W602MaqCod ;
         /* End Insert */
         /* Using cursor P03ZN6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A9961Ab_lin = P03ZN6_A9961Ab_lin[0] ;
            A9962Ab_car = P03ZN6_A9962Ab_car[0] ;
            n9962Ab_car = P03ZN6_n9962Ab_car[0] ;
            A9963Ab_des = P03ZN6_A9963Ab_des[0] ;
            n9963Ab_des = P03ZN6_n9963Ab_des[0] ;
            A9964Ab_lmp = P03ZN6_A9964Ab_lmp[0] ;
            n9964Ab_lmp = P03ZN6_n9964Ab_lmp[0] ;
            A9965Ab_dia = P03ZN6_A9965Ab_dia[0] ;
            n9965Ab_dia = P03ZN6_n9965Ab_dia[0] ;
            A652OpeCod = P03ZN6_A652OpeCod[0] ;
            n652OpeCod = P03ZN6_n652OpeCod[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE TXPCAAB01

            */
            W396EmprCod = A396EmprCod ;
            W602MaqCod = A602MaqCod ;
            W652OpeCod = A652OpeCod ;
            n652OpeCod = false ;
            A602MaqCod = AV27Maqcod ;
            A558HisProFec = AV28Hisprofec ;
            A561HisProLin = AV26Hisprolin ;
            A10481Abh_lin = A9961Ab_lin ;
            A10486Abh_cod = A9940Ab_cod ;
            A10482Abh_car = A9962Ab_car ;
            n10482Abh_car = false ;
            A10483Abh_des = A9963Ab_des ;
            A10484Abh_lmp = A9964Ab_lmp ;
            n652OpeCod = false ;
            A10485Abh_dia = A9965Ab_dia ;
            /* Using cursor P03ZN7 */
            pr_default.execute(5, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod, Integer.valueOf(A10481Abh_lin), Boolean.valueOf(n10482Abh_car), A10482Abh_car, A10483Abh_des, A10484Abh_lmp, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A10485Abh_dia});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAAB01");
            if ( (pr_default.getStatus(5) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A602MaqCod = W602MaqCod ;
            A652OpeCod = W652OpeCod ;
            n652OpeCod = false ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptosa01.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptosa01");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21Emprcod = "" ;
      AV22Maqcodi = "" ;
      AV25Maqcodf = "" ;
      Gx_msg = "" ;
      scmdbuf = "" ;
      AV23Fec1 = GXutil.nullDate() ;
      AV24Fec2 = GXutil.nullDate() ;
      P03ZN2_A130BarCodPar = new String[] {""} ;
      P03ZN2_A132BarCodReo = new byte[1] ;
      P03ZN2_A129BarCod = new int[1] ;
      P03ZN2_A396EmprCod = new String[] {""} ;
      P03ZN2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P03ZN2_A602MaqCod = new String[] {""} ;
      P03ZN2_A561HisProLin = new int[1] ;
      P03ZN2_A194BarOrdLin = new short[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A602MaqCod = "" ;
      AV27Maqcod = "" ;
      AV34Maqcod4 = "" ;
      AV28Hisprofec = GXutil.nullDate() ;
      AV31Barcodpar = "" ;
      AV32Procod = "" ;
      P03ZN3_A396EmprCod = new String[] {""} ;
      P03ZN3_A129BarCod = new int[1] ;
      P03ZN3_A132BarCodReo = new byte[1] ;
      P03ZN3_A130BarCodPar = new String[] {""} ;
      P03ZN3_A761ProFasLin = new short[1] ;
      P03ZN3_n761ProFasLin = new boolean[] {false} ;
      P03ZN3_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      P03ZN4_A396EmprCod = new String[] {""} ;
      P03ZN4_A129BarCod = new int[1] ;
      P03ZN4_A132BarCodReo = new byte[1] ;
      P03ZN4_A130BarCodPar = new String[] {""} ;
      P03ZN4_A194BarOrdLin = new short[1] ;
      P03ZN4_A9940Ab_cod = new String[] {""} ;
      P03ZN4_A758ProCod = new String[] {""} ;
      P03ZN4_A9960Ab_ult = new int[1] ;
      P03ZN4_n9960Ab_ult = new boolean[] {false} ;
      A9940Ab_cod = "" ;
      W396EmprCod = "" ;
      W602MaqCod = "" ;
      A10486Abh_cod = "" ;
      Gx_emsg = "" ;
      P03ZN6_A396EmprCod = new String[] {""} ;
      P03ZN6_A129BarCod = new int[1] ;
      P03ZN6_A132BarCodReo = new byte[1] ;
      P03ZN6_A130BarCodPar = new String[] {""} ;
      P03ZN6_A758ProCod = new String[] {""} ;
      P03ZN6_A194BarOrdLin = new short[1] ;
      P03ZN6_A9940Ab_cod = new String[] {""} ;
      P03ZN6_A9961Ab_lin = new int[1] ;
      P03ZN6_A9962Ab_car = new String[] {""} ;
      P03ZN6_n9962Ab_car = new boolean[] {false} ;
      P03ZN6_A9963Ab_des = new String[] {""} ;
      P03ZN6_n9963Ab_des = new boolean[] {false} ;
      P03ZN6_A9964Ab_lmp = new String[] {""} ;
      P03ZN6_n9964Ab_lmp = new boolean[] {false} ;
      P03ZN6_A9965Ab_dia = new java.util.Date[] {GXutil.nullDate()} ;
      P03ZN6_n9965Ab_dia = new boolean[] {false} ;
      P03ZN6_A652OpeCod = new int[1] ;
      P03ZN6_n652OpeCod = new boolean[] {false} ;
      A9962Ab_car = "" ;
      A9963Ab_des = "" ;
      A9964Ab_lmp = "" ;
      A9965Ab_dia = GXutil.resetTime( GXutil.nullDate() );
      A10482Abh_car = "" ;
      A10483Abh_des = "" ;
      A10484Abh_lmp = "" ;
      A10485Abh_dia = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptosa01__default(),
         new Object[] {
             new Object[] {
            P03ZN2_A130BarCodPar, P03ZN2_A132BarCodReo, P03ZN2_A129BarCod, P03ZN2_A396EmprCod, P03ZN2_A558HisProFec, P03ZN2_A602MaqCod, P03ZN2_A561HisProLin, P03ZN2_A194BarOrdLin
            }
            , new Object[] {
            P03ZN3_A396EmprCod, P03ZN3_A129BarCod, P03ZN3_A132BarCodReo, P03ZN3_A130BarCodPar, P03ZN3_A761ProFasLin, P03ZN3_n761ProFasLin, P03ZN3_A758ProCod
            }
            , new Object[] {
            P03ZN4_A396EmprCod, P03ZN4_A129BarCod, P03ZN4_A132BarCodReo, P03ZN4_A130BarCodPar, P03ZN4_A194BarOrdLin, P03ZN4_A9940Ab_cod, P03ZN4_A758ProCod, P03ZN4_A9960Ab_ult, P03ZN4_n9960Ab_ult
            }
            , new Object[] {
            }
            , new Object[] {
            P03ZN6_A396EmprCod, P03ZN6_A129BarCod, P03ZN6_A132BarCodReo, P03ZN6_A130BarCodPar, P03ZN6_A758ProCod, P03ZN6_A194BarOrdLin, P03ZN6_A9940Ab_cod, P03ZN6_A9961Ab_lin, P03ZN6_A9962Ab_car, P03ZN6_n9962Ab_car,
            P03ZN6_A9963Ab_des, P03ZN6_n9963Ab_des, P03ZN6_A9964Ab_lmp, P03ZN6_n9964Ab_lmp, P03ZN6_A9965Ab_dia, P03ZN6_n9965Ab_dia, P03ZN6_A652OpeCod, P03ZN6_n652OpeCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV30Barcodreo ;
   private short A194BarOrdLin ;
   private short AV33Barordlin ;
   private short A761ProFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int AV26Hisprolin ;
   private int AV29Barcod ;
   private int A9960Ab_ult ;
   private int GX_INS1412 ;
   private int A10480Abh_ult ;
   private int A9961Ab_lin ;
   private int A652OpeCod ;
   private int GX_INS1413 ;
   private int W652OpeCod ;
   private int A10481Abh_lin ;
   private String AV21Emprcod ;
   private String AV22Maqcodi ;
   private String AV25Maqcodf ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV27Maqcod ;
   private String AV34Maqcod4 ;
   private String AV31Barcodpar ;
   private String AV32Procod ;
   private String A758ProCod ;
   private String A9940Ab_cod ;
   private String W396EmprCod ;
   private String W602MaqCod ;
   private String A10486Abh_cod ;
   private String Gx_emsg ;
   private String A9962Ab_car ;
   private String A9963Ab_des ;
   private String A9964Ab_lmp ;
   private String A10482Abh_car ;
   private String A10483Abh_des ;
   private String A10484Abh_lmp ;
   private java.util.Date A9965Ab_dia ;
   private java.util.Date A10485Abh_dia ;
   private java.util.Date AV23Fec1 ;
   private java.util.Date AV24Fec2 ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV28Hisprofec ;
   private boolean n761ProFasLin ;
   private boolean returnInSub ;
   private boolean n9960Ab_ult ;
   private boolean n9962Ab_car ;
   private boolean n9963Ab_des ;
   private boolean n9964Ab_lmp ;
   private boolean n9965Ab_dia ;
   private boolean n652OpeCod ;
   private boolean n10482Abh_car ;
   private IDataStoreProvider pr_default ;
   private String[] P03ZN2_A130BarCodPar ;
   private byte[] P03ZN2_A132BarCodReo ;
   private int[] P03ZN2_A129BarCod ;
   private String[] P03ZN2_A396EmprCod ;
   private java.util.Date[] P03ZN2_A558HisProFec ;
   private String[] P03ZN2_A602MaqCod ;
   private int[] P03ZN2_A561HisProLin ;
   private short[] P03ZN2_A194BarOrdLin ;
   private String[] P03ZN3_A396EmprCod ;
   private int[] P03ZN3_A129BarCod ;
   private byte[] P03ZN3_A132BarCodReo ;
   private String[] P03ZN3_A130BarCodPar ;
   private short[] P03ZN3_A761ProFasLin ;
   private boolean[] P03ZN3_n761ProFasLin ;
   private String[] P03ZN3_A758ProCod ;
   private String[] P03ZN4_A396EmprCod ;
   private int[] P03ZN4_A129BarCod ;
   private byte[] P03ZN4_A132BarCodReo ;
   private String[] P03ZN4_A130BarCodPar ;
   private short[] P03ZN4_A194BarOrdLin ;
   private String[] P03ZN4_A9940Ab_cod ;
   private String[] P03ZN4_A758ProCod ;
   private int[] P03ZN4_A9960Ab_ult ;
   private boolean[] P03ZN4_n9960Ab_ult ;
   private String[] P03ZN6_A396EmprCod ;
   private int[] P03ZN6_A129BarCod ;
   private byte[] P03ZN6_A132BarCodReo ;
   private String[] P03ZN6_A130BarCodPar ;
   private String[] P03ZN6_A758ProCod ;
   private short[] P03ZN6_A194BarOrdLin ;
   private String[] P03ZN6_A9940Ab_cod ;
   private int[] P03ZN6_A9961Ab_lin ;
   private String[] P03ZN6_A9962Ab_car ;
   private boolean[] P03ZN6_n9962Ab_car ;
   private String[] P03ZN6_A9963Ab_des ;
   private boolean[] P03ZN6_n9963Ab_des ;
   private String[] P03ZN6_A9964Ab_lmp ;
   private boolean[] P03ZN6_n9964Ab_lmp ;
   private java.util.Date[] P03ZN6_A9965Ab_dia ;
   private boolean[] P03ZN6_n9965Ab_dia ;
   private int[] P03ZN6_A652OpeCod ;
   private boolean[] P03ZN6_n652OpeCod ;
}

final  class aptosa01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03ZN2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, HisProFec, MaqCod, HisProLin, BarOrdLin FROM TXPLHIPRO WHERE (EmprCod = ? and MaqCod >= ? and HisProFec >= ?) AND (HisProFec <= ?) AND (MaqCod <= ?) ORDER BY EmprCod, MaqCod, HisProFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03ZN3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03ZN4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, Ab_cod, ProCod, Ab_ult FROM TXPCACABp WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? and Ab_cod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, Ab_cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03ZN5", "INSERT INTO TXPCAAB00(EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod, Abh_ult) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAAB00")
         ,new ForEachCursor("P03ZN6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod, Ab_lin, Ab_car, Ab_des, Ab_lmp, Ab_dia, OpeCod FROM TXPCACAB1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Ab_cod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod, Ab_lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03ZN7", "INSERT INTO TXPCAAB01(EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod, Abh_lin, Abh_car, Abh_des, Abh_lmp, OpeCod, Abh_dia) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAAB01")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 1);
               }
               stmt.setString(8, (String)parms[8], 1);
               stmt.setString(9, (String)parms[9], 1);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[11]).intValue());
               }
               stmt.setDateTime(11, (java.util.Date)parms[12], false);
               return;
      }
   }

}

