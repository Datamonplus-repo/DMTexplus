package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apobsteca extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apobsteca pgm = new apobsteca (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      int[] aP2 = new int[] {0};
      byte[] aP3 = new byte[] {0};
      String[] aP4 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (int) GXutil.lval( args[2]);
         aP3[0] = (byte) GXutil.lval( args[3]);
         aP4[0] = (String) args[4];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4);
   }

   public apobsteca( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apobsteca.class ), "" );
   }

   public apobsteca( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      apobsteca.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      apobsteca.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apobsteca.this.AV8Discod = aP1[0];
      this.aP1 = aP1;
      apobsteca.this.AV11Barcod = aP2[0];
      this.aP2 = aP2;
      apobsteca.this.AV13Barcodreo = aP3[0];
      this.aP3 = aP3;
      apobsteca.this.AV12BarCodpar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02UZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7198Auc_Discod = P02UZ2_A7198Auc_Discod[0] ;
         A7241Auc_UltL = P02UZ2_A7241Auc_UltL[0] ;
         n7241Auc_UltL = P02UZ2_n7241Auc_UltL[0] ;
         W396EmprCod = A396EmprCod ;
         AV15Auc_UltL = A7241Auc_UltL ;
         /* Using cursor P02UZ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A7198Auc_Discod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A7232Auc_Lin = P02UZ3_A7232Auc_Lin[0] ;
            A7243Auc_usu = P02UZ3_A7243Auc_usu[0] ;
            n7243Auc_usu = P02UZ3_n7243Auc_usu[0] ;
            A7244Auc_obst = P02UZ3_A7244Auc_obst[0] ;
            n7244Auc_obst = P02UZ3_n7244Auc_obst[0] ;
            A7242Auc_fec = P02UZ3_A7242Auc_fec[0] ;
            n7242Auc_fec = P02UZ3_n7242Auc_fec[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE TXPAUDOPO

            */
            W396EmprCod = A396EmprCod ;
            A7245Aud_Hdr = AV11Barcod ;
            A7246Aud_Hdrr = AV13Barcodreo ;
            A7247Aud_Hdrp = AV12BarCodpar ;
            A7248Aud_UltL = AV15Auc_UltL ;
            n7248Aud_UltL = false ;
            /* Using cursor P02UZ4 */
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
            /*
               INSERT RECORD ON TABLE TXPAUDOP1

            */
            W396EmprCod = A396EmprCod ;
            A7245Aud_Hdr = AV11Barcod ;
            A7246Aud_Hdrr = AV13Barcodreo ;
            A7247Aud_Hdrp = AV12BarCodpar ;
            A7249Aud_Lin = A7232Auc_Lin ;
            A7250Aud_Usur = A7243Auc_usu ;
            n7250Aud_Usur = false ;
            A7251Aud_Tip = httpContext.getMessage( "AC", "") ;
            n7251Aud_Tip = false ;
            A7253Aud_Obs = A7244Auc_obst ;
            n7253Aud_Obs = false ;
            A7252Aud_Fec = A7242Auc_fec ;
            n7252Aud_Fec = false ;
            /* Using cursor P02UZ5 */
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
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pobsteca.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apobsteca.this.A396EmprCod;
      this.aP1[0] = apobsteca.this.AV8Discod;
      this.aP2[0] = apobsteca.this.AV11Barcod;
      this.aP3[0] = apobsteca.this.AV13Barcodreo;
      this.aP4[0] = apobsteca.this.AV12BarCodpar;
      Application.commitDataStores(context, remoteHandle, pr_default, "apobsteca");
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
      P02UZ2_A396EmprCod = new String[] {""} ;
      P02UZ2_A7198Auc_Discod = new int[1] ;
      P02UZ2_A7241Auc_UltL = new short[1] ;
      P02UZ2_n7241Auc_UltL = new boolean[] {false} ;
      W396EmprCod = "" ;
      P02UZ3_A396EmprCod = new String[] {""} ;
      P02UZ3_A7198Auc_Discod = new int[1] ;
      P02UZ3_A7232Auc_Lin = new short[1] ;
      P02UZ3_A7243Auc_usu = new String[] {""} ;
      P02UZ3_n7243Auc_usu = new boolean[] {false} ;
      P02UZ3_A7244Auc_obst = new String[] {""} ;
      P02UZ3_n7244Auc_obst = new boolean[] {false} ;
      P02UZ3_A7242Auc_fec = new java.util.Date[] {GXutil.nullDate()} ;
      P02UZ3_n7242Auc_fec = new boolean[] {false} ;
      A7243Auc_usu = "" ;
      A7244Auc_obst = "" ;
      A7242Auc_fec = GXutil.nullDate() ;
      A7247Aud_Hdrp = "" ;
      Gx_emsg = "" ;
      A7250Aud_Usur = "" ;
      A7251Aud_Tip = "" ;
      A7253Aud_Obs = "" ;
      A7252Aud_Fec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apobsteca__default(),
         new Object[] {
             new Object[] {
            P02UZ2_A396EmprCod, P02UZ2_A7198Auc_Discod, P02UZ2_A7241Auc_UltL, P02UZ2_n7241Auc_UltL
            }
            , new Object[] {
            P02UZ3_A396EmprCod, P02UZ3_A7198Auc_Discod, P02UZ3_A7232Auc_Lin, P02UZ3_A7243Auc_usu, P02UZ3_n7243Auc_usu, P02UZ3_A7244Auc_obst, P02UZ3_n7244Auc_obst, P02UZ3_A7242Auc_fec, P02UZ3_n7242Auc_fec
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13Barcodreo ;
   private byte A7246Aud_Hdrr ;
   private short A7241Auc_UltL ;
   private short AV15Auc_UltL ;
   private short A7232Auc_Lin ;
   private short Gx_err ;
   private int AV8Discod ;
   private int AV11Barcod ;
   private int A7198Auc_Discod ;
   private int GX_INS1028 ;
   private int A7245Aud_Hdr ;
   private int A7248Aud_UltL ;
   private int GX_INS1029 ;
   private int A7249Aud_Lin ;
   private String A396EmprCod ;
   private String AV12BarCodpar ;
   private String scmdbuf ;
   private String W396EmprCod ;
   private String A7243Auc_usu ;
   private String A7247Aud_Hdrp ;
   private String Gx_emsg ;
   private String A7250Aud_Usur ;
   private String A7251Aud_Tip ;
   private java.util.Date A7242Auc_fec ;
   private java.util.Date A7252Aud_Fec ;
   private boolean n7241Auc_UltL ;
   private boolean n7243Auc_usu ;
   private boolean n7244Auc_obst ;
   private boolean n7242Auc_fec ;
   private boolean n7248Aud_UltL ;
   private boolean n7250Aud_Usur ;
   private boolean n7251Aud_Tip ;
   private boolean n7253Aud_Obs ;
   private boolean n7252Aud_Fec ;
   private String A7244Auc_obst ;
   private String A7253Aud_Obs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02UZ2_A396EmprCod ;
   private int[] P02UZ2_A7198Auc_Discod ;
   private short[] P02UZ2_A7241Auc_UltL ;
   private boolean[] P02UZ2_n7241Auc_UltL ;
   private String[] P02UZ3_A396EmprCod ;
   private int[] P02UZ3_A7198Auc_Discod ;
   private short[] P02UZ3_A7232Auc_Lin ;
   private String[] P02UZ3_A7243Auc_usu ;
   private boolean[] P02UZ3_n7243Auc_usu ;
   private String[] P02UZ3_A7244Auc_obst ;
   private boolean[] P02UZ3_n7244Auc_obst ;
   private java.util.Date[] P02UZ3_A7242Auc_fec ;
   private boolean[] P02UZ3_n7242Auc_fec ;
}

final  class apobsteca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02UZ2", "SELECT EmprCod, Auc_Discod, Auc_UltL FROM TXPAUDPED WHERE EmprCod = ? and Auc_Discod = ? ORDER BY EmprCod, Auc_Discod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02UZ3", "SELECT EmprCod, Auc_Discod, Auc_Lin, Auc_usu, Auc_obst, Auc_fec FROM TXPAUDCOB WHERE EmprCod = ? and Auc_Discod = ? ORDER BY EmprCod, Auc_Discod, Auc_Lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02UZ4", "INSERT INTO TXPAUDOPO(EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp, Aud_UltL) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDOPO")
         ,new UpdateCursor("P02UZ5", "INSERT INTO TXPAUDOP1(EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp, Aud_Lin, Aud_Usur, Aud_Tip, Aud_Fec, Aud_Obs, Aud_Num) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDOP1")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               return;
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
      }
   }

}

