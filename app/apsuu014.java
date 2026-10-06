package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsuu014 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsuu014 pgm = new apsuu014 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apsuu014( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsuu014.class ), "" );
   }

   public apsuu014( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Procesado TABLA AUDCOB....", "") );
      /* Using cursor P02V22 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7198Auc_Discod = P02V22_A7198Auc_Discod[0] ;
         A396EmprCod = P02V22_A396EmprCod[0] ;
         A7241Auc_UltL = P02V22_A7241Auc_UltL[0] ;
         n7241Auc_UltL = P02V22_n7241Auc_UltL[0] ;
         AV15Auc_UltL = A7241Auc_UltL ;
         /* Using cursor P02V23 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A7198Auc_Discod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A7243Auc_usu = P02V23_A7243Auc_usu[0] ;
            n7243Auc_usu = P02V23_n7243Auc_usu[0] ;
            A7244Auc_obst = P02V23_A7244Auc_obst[0] ;
            n7244Auc_obst = P02V23_n7244Auc_obst[0] ;
            A7242Auc_fec = P02V23_A7242Auc_fec[0] ;
            n7242Auc_fec = P02V23_n7242Auc_fec[0] ;
            A7232Auc_Lin = P02V23_A7232Auc_Lin[0] ;
            W396EmprCod = A396EmprCod ;
            AV9Emprcod = A396EmprCod ;
            AV8Discod = A7198Auc_Discod ;
            /* Execute user subroutine: 'BARCAD' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV10Barcad == 1 )
            {
               /*
                  INSERT RECORD ON TABLE TXPAUDOPO

               */
               W396EmprCod = A396EmprCod ;
               A7245Aud_Hdr = AV11Barcod ;
               A7246Aud_Hdrr = AV13Barcodreo ;
               A7247Aud_Hdrp = AV12BarCodpar ;
               A7248Aud_UltL = 0 ;
               n7248Aud_UltL = false ;
               /* Using cursor P02V24 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A7245Aud_Hdr), Byte.valueOf(A7246Aud_Hdrr), A7247Aud_Hdrp, Boolean.valueOf(n7248Aud_UltL), Integer.valueOf(A7248Aud_UltL)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDOPO");
               if ( (pr_default.getStatus(2) == 1) )
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
               /* End Insert */
               AV14Aud_UltL = (int)(AV14Aud_UltL+1) ;
               /*
                  INSERT RECORD ON TABLE TXPAUDOP1

               */
               W396EmprCod = A396EmprCod ;
               A7245Aud_Hdr = AV11Barcod ;
               A7246Aud_Hdrr = AV13Barcodreo ;
               A7247Aud_Hdrp = AV12BarCodpar ;
               A7249Aud_Lin = AV14Aud_UltL ;
               A7250Aud_Usur = A7243Auc_usu ;
               n7250Aud_Usur = false ;
               A7251Aud_Tip = httpContext.getMessage( "AC", "") ;
               n7251Aud_Tip = false ;
               A7253Aud_Obs = A7244Auc_obst ;
               n7253Aud_Obs = false ;
               A7252Aud_Fec = A7242Auc_fec ;
               n7252Aud_Fec = false ;
               /* Using cursor P02V25 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A7245Aud_Hdr), Byte.valueOf(A7246Aud_Hdrr), A7247Aud_Hdrp, Integer.valueOf(A7249Aud_Lin), Boolean.valueOf(n7250Aud_Usur), A7250Aud_Usur, Boolean.valueOf(n7251Aud_Tip), A7251Aud_Tip, Boolean.valueOf(n7252Aud_Fec), A7252Aud_Fec, Boolean.valueOf(n7253Aud_Obs), A7253Aud_Obs});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDOP1");
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
               /* End Insert */
            }
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "FinProcesado TABLA AUDCOB....", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV10Barcad = (byte)(0) ;
      /* Using cursor P02V26 */
      pr_default.execute(4, new Object[] {AV9Emprcod, Integer.valueOf(AV8Discod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A361DisCod = P02V26_A361DisCod[0] ;
         A396EmprCod = P02V26_A396EmprCod[0] ;
         A129BarCod = P02V26_A129BarCod[0] ;
         A132BarCodReo = P02V26_A132BarCodReo[0] ;
         A130BarCodPar = P02V26_A130BarCodPar[0] ;
         AV10Barcad = (byte)(1) ;
         AV11Barcod = A129BarCod ;
         AV13Barcodreo = A132BarCodReo ;
         AV12BarCodpar = A130BarCodPar ;
         /* Execute user subroutine: 'AUDOPO' */
         S126 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S126( )
   {
      /* 'AUDOPO' Routine */
      returnInSub = false ;
      AV14Aud_UltL = 0 ;
      AV16AUDOPO = (byte)(0) ;
      /* Using cursor P02V27 */
      pr_default.execute(5, new Object[] {AV9Emprcod, Integer.valueOf(AV11Barcod), Byte.valueOf(AV13Barcodreo), AV12BarCodpar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A7247Aud_Hdrp = P02V27_A7247Aud_Hdrp[0] ;
         A7246Aud_Hdrr = P02V27_A7246Aud_Hdrr[0] ;
         A7245Aud_Hdr = P02V27_A7245Aud_Hdr[0] ;
         A396EmprCod = P02V27_A396EmprCod[0] ;
         A7248Aud_UltL = P02V27_A7248Aud_UltL[0] ;
         n7248Aud_UltL = P02V27_n7248Aud_UltL[0] ;
         AV14Aud_UltL = A7248Aud_UltL ;
         AV16AUDOPO = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(psuu014.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apsuu014");
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
      P02V22_A7198Auc_Discod = new int[1] ;
      P02V22_A396EmprCod = new String[] {""} ;
      P02V22_A7241Auc_UltL = new short[1] ;
      P02V22_n7241Auc_UltL = new boolean[] {false} ;
      A396EmprCod = "" ;
      P02V23_A396EmprCod = new String[] {""} ;
      P02V23_A7198Auc_Discod = new int[1] ;
      P02V23_A7243Auc_usu = new String[] {""} ;
      P02V23_n7243Auc_usu = new boolean[] {false} ;
      P02V23_A7244Auc_obst = new String[] {""} ;
      P02V23_n7244Auc_obst = new boolean[] {false} ;
      P02V23_A7242Auc_fec = new java.util.Date[] {GXutil.nullDate()} ;
      P02V23_n7242Auc_fec = new boolean[] {false} ;
      P02V23_A7232Auc_Lin = new short[1] ;
      A7243Auc_usu = "" ;
      A7244Auc_obst = "" ;
      A7242Auc_fec = GXutil.nullDate() ;
      W396EmprCod = "" ;
      AV9Emprcod = "" ;
      A7247Aud_Hdrp = "" ;
      AV12BarCodpar = "" ;
      Gx_emsg = "" ;
      A7250Aud_Usur = "" ;
      A7251Aud_Tip = "" ;
      A7253Aud_Obs = "" ;
      A7252Aud_Fec = GXutil.nullDate() ;
      P02V26_A361DisCod = new int[1] ;
      P02V26_A396EmprCod = new String[] {""} ;
      P02V26_A129BarCod = new int[1] ;
      P02V26_A132BarCodReo = new byte[1] ;
      P02V26_A130BarCodPar = new String[] {""} ;
      A130BarCodPar = "" ;
      P02V27_A7247Aud_Hdrp = new String[] {""} ;
      P02V27_A7246Aud_Hdrr = new byte[1] ;
      P02V27_A7245Aud_Hdr = new int[1] ;
      P02V27_A396EmprCod = new String[] {""} ;
      P02V27_A7248Aud_UltL = new int[1] ;
      P02V27_n7248Aud_UltL = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsuu014__default(),
         new Object[] {
             new Object[] {
            P02V22_A7198Auc_Discod, P02V22_A396EmprCod, P02V22_A7241Auc_UltL, P02V22_n7241Auc_UltL
            }
            , new Object[] {
            P02V23_A396EmprCod, P02V23_A7198Auc_Discod, P02V23_A7243Auc_usu, P02V23_n7243Auc_usu, P02V23_A7244Auc_obst, P02V23_n7244Auc_obst, P02V23_A7242Auc_fec, P02V23_n7242Auc_fec, P02V23_A7232Auc_Lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02V26_A361DisCod, P02V26_A396EmprCod, P02V26_A129BarCod, P02V26_A132BarCodReo, P02V26_A130BarCodPar
            }
            , new Object[] {
            P02V27_A7247Aud_Hdrp, P02V27_A7246Aud_Hdrr, P02V27_A7245Aud_Hdr, P02V27_A396EmprCod, P02V27_A7248Aud_UltL, P02V27_n7248Aud_UltL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Barcad ;
   private byte A7246Aud_Hdrr ;
   private byte AV13Barcodreo ;
   private byte A132BarCodReo ;
   private byte AV16AUDOPO ;
   private short A7241Auc_UltL ;
   private short AV15Auc_UltL ;
   private short A7232Auc_Lin ;
   private short Gx_err ;
   private int A7198Auc_Discod ;
   private int AV8Discod ;
   private int GX_INS1028 ;
   private int A7245Aud_Hdr ;
   private int AV11Barcod ;
   private int A7248Aud_UltL ;
   private int AV14Aud_UltL ;
   private int GX_INS1029 ;
   private int A7249Aud_Lin ;
   private int A361DisCod ;
   private int A129BarCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A7243Auc_usu ;
   private String W396EmprCod ;
   private String AV9Emprcod ;
   private String A7247Aud_Hdrp ;
   private String AV12BarCodpar ;
   private String Gx_emsg ;
   private String A7250Aud_Usur ;
   private String A7251Aud_Tip ;
   private String A130BarCodPar ;
   private java.util.Date A7242Auc_fec ;
   private java.util.Date A7252Aud_Fec ;
   private boolean n7241Auc_UltL ;
   private boolean n7243Auc_usu ;
   private boolean n7244Auc_obst ;
   private boolean n7242Auc_fec ;
   private boolean returnInSub ;
   private boolean n7248Aud_UltL ;
   private boolean n7250Aud_Usur ;
   private boolean n7251Aud_Tip ;
   private boolean n7253Aud_Obs ;
   private boolean n7252Aud_Fec ;
   private String A7244Auc_obst ;
   private String A7253Aud_Obs ;
   private IDataStoreProvider pr_default ;
   private int[] P02V22_A7198Auc_Discod ;
   private String[] P02V22_A396EmprCod ;
   private short[] P02V22_A7241Auc_UltL ;
   private boolean[] P02V22_n7241Auc_UltL ;
   private String[] P02V23_A396EmprCod ;
   private int[] P02V23_A7198Auc_Discod ;
   private String[] P02V23_A7243Auc_usu ;
   private boolean[] P02V23_n7243Auc_usu ;
   private String[] P02V23_A7244Auc_obst ;
   private boolean[] P02V23_n7244Auc_obst ;
   private java.util.Date[] P02V23_A7242Auc_fec ;
   private boolean[] P02V23_n7242Auc_fec ;
   private short[] P02V23_A7232Auc_Lin ;
   private int[] P02V26_A361DisCod ;
   private String[] P02V26_A396EmprCod ;
   private int[] P02V26_A129BarCod ;
   private byte[] P02V26_A132BarCodReo ;
   private String[] P02V26_A130BarCodPar ;
   private String[] P02V27_A7247Aud_Hdrp ;
   private byte[] P02V27_A7246Aud_Hdrr ;
   private int[] P02V27_A7245Aud_Hdr ;
   private String[] P02V27_A396EmprCod ;
   private int[] P02V27_A7248Aud_UltL ;
   private boolean[] P02V27_n7248Aud_UltL ;
}

final  class apsuu014__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02V22", "SELECT Auc_Discod, EmprCod, Auc_UltL FROM TXPAUDPED WHERE EmprCod = '001' ORDER BY EmprCod, Auc_Discod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02V23", "SELECT EmprCod, Auc_Discod, Auc_usu, Auc_obst, Auc_fec, Auc_Lin FROM TXPAUDCOB WHERE EmprCod = ? and Auc_Discod = ? ORDER BY EmprCod, Auc_Discod, Auc_Lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02V24", "INSERT INTO TXPAUDOPO(EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp, Aud_UltL) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDOPO")
         ,new UpdateCursor("P02V25", "INSERT INTO TXPAUDOP1(EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp, Aud_Lin, Aud_Usur, Aud_Tip, Aud_Fec, Aud_Obs, Aud_Num) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDOP1")
         ,new ForEachCursor("P02V26", "SELECT DisCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02V27", "SELECT Aud_Hdrp, Aud_Hdrr, Aud_Hdr, EmprCod, Aud_UltL FROM TXPAUDOPO WHERE EmprCod = ? and Aud_Hdr = ? and Aud_Hdrr = ? and Aud_Hdrp = ? ORDER BY EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[12], 300);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

