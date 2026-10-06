package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apobsaufr extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apobsaufr pgm = new apobsaufr (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      byte[] aP2 = new byte[] {0};
      String[] aP3 = new String[] {""};
      short[] aP4 = new short[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (byte) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
         aP4[0] = (short) GXutil.lval( args[4]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4);
   }

   public apobsaufr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apobsaufr.class ), "" );
   }

   public apobsaufr( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      apobsaufr.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      apobsaufr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apobsaufr.this.A7171Auf_barcod = aP1[0];
      this.aP1 = aP1;
      apobsaufr.this.A7172Auf_codreo = aP2[0];
      this.aP2 = aP2;
      apobsaufr.this.A7173Auf_codpar = aP3[0];
      this.aP3 = aP3;
      apobsaufr.this.A7527Auf_NumAud = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02YV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A7171Auf_barcod), Byte.valueOf(A7172Auf_codreo), A7173Auf_codpar, Short.valueOf(A7527Auf_NumAud)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7180Auf_Oper = P02YV2_A7180Auf_Oper[0] ;
         n7180Auf_Oper = P02YV2_n7180Auf_Oper[0] ;
         A7531Auf_ObsAc = P02YV2_A7531Auf_ObsAc[0] ;
         n7531Auf_ObsAc = P02YV2_n7531Auf_ObsAc[0] ;
         A7181Auf_FecHr = P02YV2_A7181Auf_FecHr[0] ;
         n7181Auf_FecHr = P02YV2_n7181Auf_FecHr[0] ;
         W396EmprCod = A396EmprCod ;
         AV27Aud_UltL = 1 ;
         /*
            INSERT RECORD ON TABLE TXPAUDOPO

         */
         W396EmprCod = A396EmprCod ;
         A7245Aud_Hdr = A7171Auf_barcod ;
         A7246Aud_Hdrr = A7172Auf_codreo ;
         A7247Aud_Hdrp = A7173Auf_codpar ;
         A7248Aud_UltL = 1 ;
         n7248Aud_UltL = false ;
         /* Using cursor P02YV3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A7245Aud_Hdr), Byte.valueOf(A7246Aud_Hdrr), A7247Aud_Hdrp, Boolean.valueOf(n7248Aud_UltL), Integer.valueOf(A7248Aud_UltL)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDOPO");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P02YV4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A7245Aud_Hdr), Byte.valueOf(A7246Aud_Hdrr), A7247Aud_Hdrp});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A396EmprCod = P02YV4_A396EmprCod[0] ;
               A7245Aud_Hdr = P02YV4_A7245Aud_Hdr[0] ;
               A7246Aud_Hdrr = P02YV4_A7246Aud_Hdrr[0] ;
               A7247Aud_Hdrp = P02YV4_A7247Aud_Hdrp[0] ;
               A7248Aud_UltL = P02YV4_A7248Aud_UltL[0] ;
               n7248Aud_UltL = P02YV4_n7248Aud_UltL[0] ;
               AV27Aud_UltL = (int)(A7248Aud_UltL+1) ;
               A7248Aud_UltL = AV27Aud_UltL ;
               n7248Aud_UltL = false ;
               /* Using cursor P02YV5 */
               pr_default.execute(3, new Object[] {Boolean.valueOf(n7248Aud_UltL), Integer.valueOf(A7248Aud_UltL), A396EmprCod, Integer.valueOf(A7245Aud_Hdr), Byte.valueOf(A7246Aud_Hdrr), A7247Aud_Hdrp});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDOPO");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
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
         A7245Aud_Hdr = A7171Auf_barcod ;
         A7246Aud_Hdrr = A7172Auf_codreo ;
         A7247Aud_Hdrp = A7173Auf_codpar ;
         A7249Aud_Lin = AV27Aud_UltL ;
         A7250Aud_Usur = GXutil.trim( GXutil.str( A7180Auf_Oper, 6, 0)) ;
         n7250Aud_Usur = false ;
         A7251Aud_Tip = httpContext.getMessage( "AF", "") ;
         n7251Aud_Tip = false ;
         A7253Aud_Obs = A7531Auf_ObsAc ;
         n7253Aud_Obs = false ;
         A7252Aud_Fec = GXutil.resetTime(A7181Auf_FecHr) ;
         n7252Aud_Fec = false ;
         A7582Aud_Num = A7527Auf_NumAud ;
         n7582Aud_Num = false ;
         /* Using cursor P02YV6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A7245Aud_Hdr), Byte.valueOf(A7246Aud_Hdrr), A7247Aud_Hdrp, Integer.valueOf(A7249Aud_Lin), Boolean.valueOf(n7250Aud_Usur), A7250Aud_Usur, Boolean.valueOf(n7251Aud_Tip), A7251Aud_Tip, Boolean.valueOf(n7252Aud_Fec), A7252Aud_Fec, Boolean.valueOf(n7253Aud_Obs), A7253Aud_Obs, Boolean.valueOf(n7582Aud_Num), Integer.valueOf(A7582Aud_Num)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDOP1");
         if ( (pr_default.getStatus(4) == 1) )
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
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pobsaufr.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apobsaufr.this.A396EmprCod;
      this.aP1[0] = apobsaufr.this.A7171Auf_barcod;
      this.aP2[0] = apobsaufr.this.A7172Auf_codreo;
      this.aP3[0] = apobsaufr.this.A7173Auf_codpar;
      this.aP4[0] = apobsaufr.this.A7527Auf_NumAud;
      Application.commitDataStores(context, remoteHandle, pr_default, "apobsaufr");
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
      P02YV2_A396EmprCod = new String[] {""} ;
      P02YV2_A7171Auf_barcod = new int[1] ;
      P02YV2_A7172Auf_codreo = new byte[1] ;
      P02YV2_A7173Auf_codpar = new String[] {""} ;
      P02YV2_A7527Auf_NumAud = new short[1] ;
      P02YV2_A7180Auf_Oper = new int[1] ;
      P02YV2_n7180Auf_Oper = new boolean[] {false} ;
      P02YV2_A7531Auf_ObsAc = new String[] {""} ;
      P02YV2_n7531Auf_ObsAc = new boolean[] {false} ;
      P02YV2_A7181Auf_FecHr = new java.util.Date[] {GXutil.nullDate()} ;
      P02YV2_n7181Auf_FecHr = new boolean[] {false} ;
      A7531Auf_ObsAc = "" ;
      A7181Auf_FecHr = GXutil.resetTime( GXutil.nullDate() );
      W396EmprCod = "" ;
      A7247Aud_Hdrp = "" ;
      Gx_emsg = "" ;
      P02YV4_A396EmprCod = new String[] {""} ;
      P02YV4_A7245Aud_Hdr = new int[1] ;
      P02YV4_A7246Aud_Hdrr = new byte[1] ;
      P02YV4_A7247Aud_Hdrp = new String[] {""} ;
      P02YV4_A7248Aud_UltL = new int[1] ;
      P02YV4_n7248Aud_UltL = new boolean[] {false} ;
      A7250Aud_Usur = "" ;
      A7251Aud_Tip = "" ;
      A7253Aud_Obs = "" ;
      A7252Aud_Fec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apobsaufr__default(),
         new Object[] {
             new Object[] {
            P02YV2_A396EmprCod, P02YV2_A7171Auf_barcod, P02YV2_A7172Auf_codreo, P02YV2_A7173Auf_codpar, P02YV2_A7527Auf_NumAud, P02YV2_A7180Auf_Oper, P02YV2_n7180Auf_Oper, P02YV2_A7531Auf_ObsAc, P02YV2_n7531Auf_ObsAc, P02YV2_A7181Auf_FecHr,
            P02YV2_n7181Auf_FecHr
            }
            , new Object[] {
            }
            , new Object[] {
            P02YV4_A396EmprCod, P02YV4_A7245Aud_Hdr, P02YV4_A7246Aud_Hdrr, P02YV4_A7247Aud_Hdrp, P02YV4_A7248Aud_UltL, P02YV4_n7248Aud_UltL
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

   private byte A7172Auf_codreo ;
   private byte A7246Aud_Hdrr ;
   private short A7527Auf_NumAud ;
   private short Gx_err ;
   private int A7171Auf_barcod ;
   private int A7180Auf_Oper ;
   private int AV27Aud_UltL ;
   private int GX_INS1028 ;
   private int A7245Aud_Hdr ;
   private int A7248Aud_UltL ;
   private int GX_INS1029 ;
   private int A7249Aud_Lin ;
   private int A7582Aud_Num ;
   private String A396EmprCod ;
   private String A7173Auf_codpar ;
   private String scmdbuf ;
   private String W396EmprCod ;
   private String A7247Aud_Hdrp ;
   private String Gx_emsg ;
   private String A7250Aud_Usur ;
   private String A7251Aud_Tip ;
   private java.util.Date A7181Auf_FecHr ;
   private java.util.Date A7252Aud_Fec ;
   private boolean n7180Auf_Oper ;
   private boolean n7531Auf_ObsAc ;
   private boolean n7181Auf_FecHr ;
   private boolean n7248Aud_UltL ;
   private boolean n7250Aud_Usur ;
   private boolean n7251Aud_Tip ;
   private boolean n7253Aud_Obs ;
   private boolean n7252Aud_Fec ;
   private boolean n7582Aud_Num ;
   private String A7531Auf_ObsAc ;
   private String A7253Aud_Obs ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02YV2_A396EmprCod ;
   private int[] P02YV2_A7171Auf_barcod ;
   private byte[] P02YV2_A7172Auf_codreo ;
   private String[] P02YV2_A7173Auf_codpar ;
   private short[] P02YV2_A7527Auf_NumAud ;
   private int[] P02YV2_A7180Auf_Oper ;
   private boolean[] P02YV2_n7180Auf_Oper ;
   private String[] P02YV2_A7531Auf_ObsAc ;
   private boolean[] P02YV2_n7531Auf_ObsAc ;
   private java.util.Date[] P02YV2_A7181Auf_FecHr ;
   private boolean[] P02YV2_n7181Auf_FecHr ;
   private String[] P02YV4_A396EmprCod ;
   private int[] P02YV4_A7245Aud_Hdr ;
   private byte[] P02YV4_A7246Aud_Hdrr ;
   private String[] P02YV4_A7247Aud_Hdrp ;
   private int[] P02YV4_A7248Aud_UltL ;
   private boolean[] P02YV4_n7248Aud_UltL ;
}

final  class apobsaufr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02YV2", "SELECT EmprCod, Auf_barcod, Auf_codreo, Auf_codpar, Auf_NumAud, Auf_Oper, Auf_ObsAc, Auf_FecHr FROM TXPAUDFIN WHERE EmprCod = ? and Auf_barcod = ? and Auf_codreo = ? and Auf_codpar = ? and Auf_NumAud = ? ORDER BY EmprCod, Auf_barcod, Auf_codreo, Auf_codpar, Auf_NumAud ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02YV3", "INSERT INTO TXPAUDOPO(EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp, Aud_UltL) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDOPO")
         ,new ForEachCursor("P02YV4", "SELECT EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp, Aud_UltL FROM TXPAUDOPO WHERE EmprCod = ? and Aud_Hdr = ? and Aud_Hdrr = ? and Aud_Hdrp = ? ORDER BY EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02YV5", "UPDATE TXPAUDOPO SET Aud_UltL=?  WHERE EmprCod = ? AND Aud_Hdr = ? AND Aud_Hdrr = ? AND Aud_Hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDOPO")
         ,new UpdateCursor("P02YV6", "INSERT INTO TXPAUDOP1(EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp, Aud_Lin, Aud_Usur, Aud_Tip, Aud_Fec, Aud_Obs, Aud_Num) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDOP1")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
            case 4 :
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
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[14]).intValue());
               }
               return;
      }
   }

}

