package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptosa05 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptosa05 pgm = new aptosa05 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptosa05( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptosa05.class ), "" );
   }

   public aptosa05( int remoteHandle ,
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
      AV22Maqcodi = httpContext.getMessage( "ACEM  ", "") ;
      AV25Maqcodf = httpContext.getMessage( "ACEM99", "") ;
      Gx_msg = httpContext.getMessage( "Procesando Maquinas ACEM", "") ;
      System.out.println( Gx_msg );
      /* Using cursor P03ZQ2 */
      pr_default.execute(0, new Object[] {AV21Emprcod, AV22Maqcodi, AV23Fec1, AV24Fec2, AV25Maqcodf});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P03ZQ2_A130BarCodPar[0] ;
         A132BarCodReo = P03ZQ2_A132BarCodReo[0] ;
         A129BarCod = P03ZQ2_A129BarCod[0] ;
         A396EmprCod = P03ZQ2_A396EmprCod[0] ;
         A558HisProFec = P03ZQ2_A558HisProFec[0] ;
         A602MaqCod = P03ZQ2_A602MaqCod[0] ;
         A561HisProLin = P03ZQ2_A561HisProLin[0] ;
         A194BarOrdLin = P03ZQ2_A194BarOrdLin[0] ;
         AV26Hisprolin = A561HisProLin ;
         AV27Maqcod = A602MaqCod ;
         AV34Maqcod4 = GXutil.substring( A602MaqCod, 1, 4) ;
         AV28Hisprofec = A558HisProFec ;
         AV29Barcod = A129BarCod ;
         AV30Barcodreo = A132BarCodReo ;
         AV31Barcodpar = A130BarCodPar ;
         AV33Barordlin = A194BarOrdLin ;
         AV32Procod = " " ;
         /* Using cursor P03ZQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A761ProFasLin = P03ZQ3_A761ProFasLin[0] ;
            n761ProFasLin = P03ZQ3_n761ProFasLin[0] ;
            A758ProCod = P03ZQ3_A758ProCod[0] ;
            AV32Procod = A758ProCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Execute user subroutine: 'EMPAQUETAR' */
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
      Gx_msg = httpContext.getMessage( "Fin Procesando Maquinas ACEM.Tablas CAEM00/CAEM01", "") ;
      httpContext.GX_msglist.addItem(Gx_msg);
      cleanup();
   }

   public void S111( )
   {
      /* 'EMPAQUETAR' Routine */
      returnInSub = false ;
      /* Using cursor P03ZQ4 */
      pr_default.execute(2, new Object[] {AV21Emprcod, Integer.valueOf(AV29Barcod), Byte.valueOf(AV30Barcodreo), AV31Barcodpar, Short.valueOf(AV33Barordlin), AV34Maqcod4});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P03ZQ4_A396EmprCod[0] ;
         A129BarCod = P03ZQ4_A129BarCod[0] ;
         A132BarCodReo = P03ZQ4_A132BarCodReo[0] ;
         A130BarCodPar = P03ZQ4_A130BarCodPar[0] ;
         A194BarOrdLin = P03ZQ4_A194BarOrdLin[0] ;
         A9966Em_cod = P03ZQ4_A9966Em_cod[0] ;
         A758ProCod = P03ZQ4_A758ProCod[0] ;
         A9976Em_ult = P03ZQ4_A9976Em_ult[0] ;
         n9976Em_ult = P03ZQ4_n9976Em_ult[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPCAEM00

         */
         W396EmprCod = A396EmprCod ;
         W602MaqCod = A602MaqCod ;
         A602MaqCod = AV27Maqcod ;
         A558HisProFec = AV28Hisprofec ;
         A561HisProLin = AV26Hisprolin ;
         A10495Emh_cod = A9966Em_cod ;
         A10496Emh_ult = A9976Em_ult ;
         /* Using cursor P03ZQ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10495Emh_cod, Integer.valueOf(A10496Emh_ult)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAEM00");
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
         /* Using cursor P03ZQ6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9966Em_cod});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A9977Em_lin = P03ZQ6_A9977Em_lin[0] ;
            A9979Em_carv = P03ZQ6_A9979Em_carv[0] ;
            n9979Em_carv = P03ZQ6_n9979Em_carv[0] ;
            A9978Em_Lazos = P03ZQ6_A9978Em_Lazos[0] ;
            n9978Em_Lazos = P03ZQ6_n9978Em_Lazos[0] ;
            A9980Em_dia = P03ZQ6_A9980Em_dia[0] ;
            n9980Em_dia = P03ZQ6_n9980Em_dia[0] ;
            A652OpeCod = P03ZQ6_A652OpeCod[0] ;
            n652OpeCod = P03ZQ6_n652OpeCod[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE TXPCAEM01

            */
            W396EmprCod = A396EmprCod ;
            W602MaqCod = A602MaqCod ;
            W652OpeCod = A652OpeCod ;
            n652OpeCod = false ;
            A602MaqCod = AV27Maqcod ;
            A558HisProFec = AV28Hisprofec ;
            A561HisProLin = AV26Hisprolin ;
            A10495Emh_cod = A9966Em_cod ;
            A10497Emh_lin = A9977Em_lin ;
            A10499Emh_carv = A9979Em_carv ;
            n10499Emh_carv = false ;
            A10498Emh_Lazos = A9978Em_Lazos ;
            n652OpeCod = false ;
            A10500Emh_dia = A9980Em_dia ;
            /* Using cursor P03ZQ7 */
            pr_default.execute(5, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10495Emh_cod, Integer.valueOf(A10497Emh_lin), A10498Emh_Lazos, Boolean.valueOf(n10499Emh_carv), A10499Emh_carv, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A10500Emh_dia});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAEM01");
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
      GXutil.refClasses(ptosa05.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptosa05");
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
      P03ZQ2_A130BarCodPar = new String[] {""} ;
      P03ZQ2_A132BarCodReo = new byte[1] ;
      P03ZQ2_A129BarCod = new int[1] ;
      P03ZQ2_A396EmprCod = new String[] {""} ;
      P03ZQ2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P03ZQ2_A602MaqCod = new String[] {""} ;
      P03ZQ2_A561HisProLin = new int[1] ;
      P03ZQ2_A194BarOrdLin = new short[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A602MaqCod = "" ;
      AV27Maqcod = "" ;
      AV34Maqcod4 = "" ;
      AV28Hisprofec = GXutil.nullDate() ;
      AV31Barcodpar = "" ;
      AV32Procod = "" ;
      P03ZQ3_A396EmprCod = new String[] {""} ;
      P03ZQ3_A129BarCod = new int[1] ;
      P03ZQ3_A132BarCodReo = new byte[1] ;
      P03ZQ3_A130BarCodPar = new String[] {""} ;
      P03ZQ3_A761ProFasLin = new short[1] ;
      P03ZQ3_n761ProFasLin = new boolean[] {false} ;
      P03ZQ3_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      P03ZQ4_A396EmprCod = new String[] {""} ;
      P03ZQ4_A129BarCod = new int[1] ;
      P03ZQ4_A132BarCodReo = new byte[1] ;
      P03ZQ4_A130BarCodPar = new String[] {""} ;
      P03ZQ4_A194BarOrdLin = new short[1] ;
      P03ZQ4_A9966Em_cod = new String[] {""} ;
      P03ZQ4_A758ProCod = new String[] {""} ;
      P03ZQ4_A9976Em_ult = new int[1] ;
      P03ZQ4_n9976Em_ult = new boolean[] {false} ;
      A9966Em_cod = "" ;
      W396EmprCod = "" ;
      W602MaqCod = "" ;
      A10495Emh_cod = "" ;
      Gx_emsg = "" ;
      P03ZQ6_A396EmprCod = new String[] {""} ;
      P03ZQ6_A129BarCod = new int[1] ;
      P03ZQ6_A132BarCodReo = new byte[1] ;
      P03ZQ6_A130BarCodPar = new String[] {""} ;
      P03ZQ6_A758ProCod = new String[] {""} ;
      P03ZQ6_A194BarOrdLin = new short[1] ;
      P03ZQ6_A9966Em_cod = new String[] {""} ;
      P03ZQ6_A9977Em_lin = new int[1] ;
      P03ZQ6_A9979Em_carv = new String[] {""} ;
      P03ZQ6_n9979Em_carv = new boolean[] {false} ;
      P03ZQ6_A9978Em_Lazos = new String[] {""} ;
      P03ZQ6_n9978Em_Lazos = new boolean[] {false} ;
      P03ZQ6_A9980Em_dia = new java.util.Date[] {GXutil.nullDate()} ;
      P03ZQ6_n9980Em_dia = new boolean[] {false} ;
      P03ZQ6_A652OpeCod = new int[1] ;
      P03ZQ6_n652OpeCod = new boolean[] {false} ;
      A9979Em_carv = "" ;
      A9978Em_Lazos = "" ;
      A9980Em_dia = GXutil.resetTime( GXutil.nullDate() );
      A10499Emh_carv = "" ;
      A10498Emh_Lazos = "" ;
      A10500Emh_dia = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptosa05__default(),
         new Object[] {
             new Object[] {
            P03ZQ2_A130BarCodPar, P03ZQ2_A132BarCodReo, P03ZQ2_A129BarCod, P03ZQ2_A396EmprCod, P03ZQ2_A558HisProFec, P03ZQ2_A602MaqCod, P03ZQ2_A561HisProLin, P03ZQ2_A194BarOrdLin
            }
            , new Object[] {
            P03ZQ3_A396EmprCod, P03ZQ3_A129BarCod, P03ZQ3_A132BarCodReo, P03ZQ3_A130BarCodPar, P03ZQ3_A761ProFasLin, P03ZQ3_n761ProFasLin, P03ZQ3_A758ProCod
            }
            , new Object[] {
            P03ZQ4_A396EmprCod, P03ZQ4_A129BarCod, P03ZQ4_A132BarCodReo, P03ZQ4_A130BarCodPar, P03ZQ4_A194BarOrdLin, P03ZQ4_A9966Em_cod, P03ZQ4_A758ProCod, P03ZQ4_A9976Em_ult, P03ZQ4_n9976Em_ult
            }
            , new Object[] {
            }
            , new Object[] {
            P03ZQ6_A396EmprCod, P03ZQ6_A129BarCod, P03ZQ6_A132BarCodReo, P03ZQ6_A130BarCodPar, P03ZQ6_A758ProCod, P03ZQ6_A194BarOrdLin, P03ZQ6_A9966Em_cod, P03ZQ6_A9977Em_lin, P03ZQ6_A9979Em_carv, P03ZQ6_n9979Em_carv,
            P03ZQ6_A9978Em_Lazos, P03ZQ6_n9978Em_Lazos, P03ZQ6_A9980Em_dia, P03ZQ6_n9980Em_dia, P03ZQ6_A652OpeCod, P03ZQ6_n652OpeCod
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
   private int A9976Em_ult ;
   private int GX_INS1416 ;
   private int A10496Emh_ult ;
   private int A9977Em_lin ;
   private int A652OpeCod ;
   private int GX_INS1417 ;
   private int W652OpeCod ;
   private int A10497Emh_lin ;
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
   private String A9966Em_cod ;
   private String W396EmprCod ;
   private String W602MaqCod ;
   private String A10495Emh_cod ;
   private String Gx_emsg ;
   private String A9979Em_carv ;
   private String A9978Em_Lazos ;
   private String A10499Emh_carv ;
   private String A10498Emh_Lazos ;
   private java.util.Date A9980Em_dia ;
   private java.util.Date A10500Emh_dia ;
   private java.util.Date AV23Fec1 ;
   private java.util.Date AV24Fec2 ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV28Hisprofec ;
   private boolean n761ProFasLin ;
   private boolean returnInSub ;
   private boolean n9976Em_ult ;
   private boolean n9979Em_carv ;
   private boolean n9978Em_Lazos ;
   private boolean n9980Em_dia ;
   private boolean n652OpeCod ;
   private boolean n10499Emh_carv ;
   private IDataStoreProvider pr_default ;
   private String[] P03ZQ2_A130BarCodPar ;
   private byte[] P03ZQ2_A132BarCodReo ;
   private int[] P03ZQ2_A129BarCod ;
   private String[] P03ZQ2_A396EmprCod ;
   private java.util.Date[] P03ZQ2_A558HisProFec ;
   private String[] P03ZQ2_A602MaqCod ;
   private int[] P03ZQ2_A561HisProLin ;
   private short[] P03ZQ2_A194BarOrdLin ;
   private String[] P03ZQ3_A396EmprCod ;
   private int[] P03ZQ3_A129BarCod ;
   private byte[] P03ZQ3_A132BarCodReo ;
   private String[] P03ZQ3_A130BarCodPar ;
   private short[] P03ZQ3_A761ProFasLin ;
   private boolean[] P03ZQ3_n761ProFasLin ;
   private String[] P03ZQ3_A758ProCod ;
   private String[] P03ZQ4_A396EmprCod ;
   private int[] P03ZQ4_A129BarCod ;
   private byte[] P03ZQ4_A132BarCodReo ;
   private String[] P03ZQ4_A130BarCodPar ;
   private short[] P03ZQ4_A194BarOrdLin ;
   private String[] P03ZQ4_A9966Em_cod ;
   private String[] P03ZQ4_A758ProCod ;
   private int[] P03ZQ4_A9976Em_ult ;
   private boolean[] P03ZQ4_n9976Em_ult ;
   private String[] P03ZQ6_A396EmprCod ;
   private int[] P03ZQ6_A129BarCod ;
   private byte[] P03ZQ6_A132BarCodReo ;
   private String[] P03ZQ6_A130BarCodPar ;
   private String[] P03ZQ6_A758ProCod ;
   private short[] P03ZQ6_A194BarOrdLin ;
   private String[] P03ZQ6_A9966Em_cod ;
   private int[] P03ZQ6_A9977Em_lin ;
   private String[] P03ZQ6_A9979Em_carv ;
   private boolean[] P03ZQ6_n9979Em_carv ;
   private String[] P03ZQ6_A9978Em_Lazos ;
   private boolean[] P03ZQ6_n9978Em_Lazos ;
   private java.util.Date[] P03ZQ6_A9980Em_dia ;
   private boolean[] P03ZQ6_n9980Em_dia ;
   private int[] P03ZQ6_A652OpeCod ;
   private boolean[] P03ZQ6_n652OpeCod ;
}

final  class aptosa05__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03ZQ2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, HisProFec, MaqCod, HisProLin, BarOrdLin FROM TXPLHIPRO WHERE (EmprCod = ? and MaqCod >= ? and HisProFec >= ?) AND (HisProFec <= ?) AND (MaqCod <= ?) ORDER BY EmprCod, MaqCod, HisProFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03ZQ3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03ZQ4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, Em_cod, ProCod, Em_ult FROM TXPCACEMp WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? and Em_cod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, Em_cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03ZQ5", "INSERT INTO TXPCAEM00(EmprCod, MaqCod, HisProFec, HisProLin, Emh_cod, Emh_ult) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAEM00")
         ,new ForEachCursor("P03ZQ6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Em_cod, Em_lin, Em_carv, Em_Lazos, Em_dia, OpeCod FROM TXPCACEM1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Em_cod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Em_cod, Em_lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03ZQ7", "INSERT INTO TXPCAEM01(EmprCod, MaqCod, HisProFec, HisProLin, Emh_cod, Emh_lin, Emh_Lazos, Emh_carv, OpeCod, Emh_dia) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAEM01")
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
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
               stmt.setString(7, (String)parms[6], 1);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[10]).intValue());
               }
               stmt.setDateTime(10, (java.util.Date)parms[11], false);
               return;
      }
   }

}

