package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pobsaui extends GXProcedure
{
   public pobsaui( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pobsaui.class ), "" );
   }

   public pobsaui( int remoteHandle ,
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
      pobsaui.this.aP4 = new short[] {0};
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
      pobsaui.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pobsaui.this.A7186Aui_barcod = aP1[0];
      this.aP1 = aP1;
      pobsaui.this.A7187Aui_codreo = aP2[0];
      this.aP2 = aP2;
      pobsaui.this.A7188Aui_codpar = aP3[0];
      this.aP3 = aP3;
      pobsaui.this.A7417Aui_NumAud = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20no_obs = (byte)(0) ;
      /* Using cursor P02YT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A7186Aui_barcod), Byte.valueOf(A7187Aui_codreo), A7188Aui_codpar, Short.valueOf(A7417Aui_NumAud)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7182Auc_CodDef = P02YT2_A7182Auc_CodDef[0] ;
         if ( A7182Auc_CodDef == 9999 )
         {
            AV20no_obs = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV20no_obs == 1 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P02YT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A7186Aui_barcod), Byte.valueOf(A7187Aui_codreo), A7188Aui_codpar, Short.valueOf(A7417Aui_NumAud)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A7193Aui_Obs = P02YT3_A7193Aui_Obs[0] ;
         n7193Aui_Obs = P02YT3_n7193Aui_Obs[0] ;
         A7419Aui_UsuAud = P02YT3_A7419Aui_UsuAud[0] ;
         n7419Aui_UsuAud = P02YT3_n7419Aui_UsuAud[0] ;
         A7418Aui_FecAud = P02YT3_A7418Aui_FecAud[0] ;
         n7418Aui_FecAud = P02YT3_n7418Aui_FecAud[0] ;
         W396EmprCod = A396EmprCod ;
         AV17Nlin = (short)(GXutil.gxmlines( A7193Aui_Obs, (short)(60))) ;
         AV14Aud_UltL = 1 ;
         /*
            INSERT RECORD ON TABLE TXPAUDOPO

         */
         W396EmprCod = A396EmprCod ;
         A7245Aud_Hdr = A7186Aui_barcod ;
         A7246Aud_Hdrr = A7187Aui_codreo ;
         A7247Aud_Hdrp = A7188Aui_codpar ;
         A7248Aud_UltL = 1 ;
         n7248Aud_UltL = false ;
         /* Using cursor P02YT4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A7245Aud_Hdr), Byte.valueOf(A7246Aud_Hdrr), A7247Aud_Hdrp, Boolean.valueOf(n7248Aud_UltL), Integer.valueOf(A7248Aud_UltL)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDOPO");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P02YT5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A7245Aud_Hdr), Byte.valueOf(A7246Aud_Hdrr), A7247Aud_Hdrp});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A396EmprCod = P02YT5_A396EmprCod[0] ;
               A7245Aud_Hdr = P02YT5_A7245Aud_Hdr[0] ;
               A7246Aud_Hdrr = P02YT5_A7246Aud_Hdrr[0] ;
               A7247Aud_Hdrp = P02YT5_A7247Aud_Hdrp[0] ;
               A7248Aud_UltL = P02YT5_A7248Aud_UltL[0] ;
               n7248Aud_UltL = P02YT5_n7248Aud_UltL[0] ;
               AV14Aud_UltL = (int)(A7248Aud_UltL+1) ;
               A7248Aud_UltL = AV14Aud_UltL ;
               n7248Aud_UltL = false ;
               /* Using cursor P02YT6 */
               pr_default.execute(4, new Object[] {Boolean.valueOf(n7248Aud_UltL), Integer.valueOf(A7248Aud_UltL), A396EmprCod, Integer.valueOf(A7245Aud_Hdr), Byte.valueOf(A7246Aud_Hdrr), A7247Aud_Hdrp});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDOPO");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
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
         A7245Aud_Hdr = A7186Aui_barcod ;
         A7246Aud_Hdrr = A7187Aui_codreo ;
         A7247Aud_Hdrp = A7188Aui_codpar ;
         A7249Aud_Lin = AV14Aud_UltL ;
         A7250Aud_Usur = A7419Aui_UsuAud ;
         n7250Aud_Usur = false ;
         A7251Aud_Tip = httpContext.getMessage( "AI", "") ;
         n7251Aud_Tip = false ;
         AV18i = (short)(1) ;
         while ( AV18i <= AV17Nlin )
         {
            AV19Aud_Ob = GXutil.gxgetmli( A7193Aui_Obs, AV18i, (short)(60)) ;
            if ( AV18i == 1 )
            {
               A7253Aud_Obs = AV19Aud_Ob ;
               n7253Aud_Obs = false ;
            }
            else
            {
               A7253Aud_Obs += AV19Aud_Ob ;
               n7253Aud_Obs = false ;
            }
            AV18i = (short)(AV18i+1) ;
         }
         A7252Aud_Fec = GXutil.resetTime(A7418Aui_FecAud) ;
         n7252Aud_Fec = false ;
         A7582Aud_Num = A7417Aui_NumAud ;
         n7582Aud_Num = false ;
         /* Using cursor P02YT7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A7245Aud_Hdr), Byte.valueOf(A7246Aud_Hdrr), A7247Aud_Hdrp, Integer.valueOf(A7249Aud_Lin), Boolean.valueOf(n7250Aud_Usur), A7250Aud_Usur, Boolean.valueOf(n7251Aud_Tip), A7251Aud_Tip, Boolean.valueOf(n7252Aud_Fec), A7252Aud_Fec, Boolean.valueOf(n7253Aud_Obs), A7253Aud_Obs, Boolean.valueOf(n7582Aud_Num), Integer.valueOf(A7582Aud_Num)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDOP1");
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
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pobsaui.this.A396EmprCod;
      this.aP1[0] = pobsaui.this.A7186Aui_barcod;
      this.aP2[0] = pobsaui.this.A7187Aui_codreo;
      this.aP3[0] = pobsaui.this.A7188Aui_codpar;
      this.aP4[0] = pobsaui.this.A7417Aui_NumAud;
      Application.commitDataStores(context, remoteHandle, pr_default, "pobsaui");
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
      P02YT2_A396EmprCod = new String[] {""} ;
      P02YT2_A7186Aui_barcod = new int[1] ;
      P02YT2_A7187Aui_codreo = new byte[1] ;
      P02YT2_A7188Aui_codpar = new String[] {""} ;
      P02YT2_A7417Aui_NumAud = new short[1] ;
      P02YT2_A7182Auc_CodDef = new short[1] ;
      P02YT3_A7193Aui_Obs = new String[] {""} ;
      P02YT3_n7193Aui_Obs = new boolean[] {false} ;
      P02YT3_A396EmprCod = new String[] {""} ;
      P02YT3_A7186Aui_barcod = new int[1] ;
      P02YT3_A7187Aui_codreo = new byte[1] ;
      P02YT3_A7188Aui_codpar = new String[] {""} ;
      P02YT3_A7417Aui_NumAud = new short[1] ;
      P02YT3_A7419Aui_UsuAud = new String[] {""} ;
      P02YT3_n7419Aui_UsuAud = new boolean[] {false} ;
      P02YT3_A7418Aui_FecAud = new java.util.Date[] {GXutil.nullDate()} ;
      P02YT3_n7418Aui_FecAud = new boolean[] {false} ;
      A7193Aui_Obs = "" ;
      A7419Aui_UsuAud = "" ;
      A7418Aui_FecAud = GXutil.resetTime( GXutil.nullDate() );
      W396EmprCod = "" ;
      A7247Aud_Hdrp = "" ;
      Gx_emsg = "" ;
      P02YT5_A396EmprCod = new String[] {""} ;
      P02YT5_A7245Aud_Hdr = new int[1] ;
      P02YT5_A7246Aud_Hdrr = new byte[1] ;
      P02YT5_A7247Aud_Hdrp = new String[] {""} ;
      P02YT5_A7248Aud_UltL = new int[1] ;
      P02YT5_n7248Aud_UltL = new boolean[] {false} ;
      A7250Aud_Usur = "" ;
      A7251Aud_Tip = "" ;
      AV19Aud_Ob = "" ;
      A7253Aud_Obs = "" ;
      A7252Aud_Fec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pobsaui__default(),
         new Object[] {
             new Object[] {
            P02YT2_A396EmprCod, P02YT2_A7186Aui_barcod, P02YT2_A7187Aui_codreo, P02YT2_A7188Aui_codpar, P02YT2_A7417Aui_NumAud, P02YT2_A7182Auc_CodDef
            }
            , new Object[] {
            P02YT3_A7193Aui_Obs, P02YT3_n7193Aui_Obs, P02YT3_A396EmprCod, P02YT3_A7186Aui_barcod, P02YT3_A7187Aui_codreo, P02YT3_A7188Aui_codpar, P02YT3_A7417Aui_NumAud, P02YT3_A7419Aui_UsuAud, P02YT3_n7419Aui_UsuAud, P02YT3_A7418Aui_FecAud,
            P02YT3_n7418Aui_FecAud
            }
            , new Object[] {
            }
            , new Object[] {
            P02YT5_A396EmprCod, P02YT5_A7245Aud_Hdr, P02YT5_A7246Aud_Hdrr, P02YT5_A7247Aud_Hdrp, P02YT5_A7248Aud_UltL, P02YT5_n7248Aud_UltL
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

   private byte A7187Aui_codreo ;
   private byte AV20no_obs ;
   private byte A7246Aud_Hdrr ;
   private short A7417Aui_NumAud ;
   private short A7182Auc_CodDef ;
   private short AV17Nlin ;
   private short Gx_err ;
   private short AV18i ;
   private int A7186Aui_barcod ;
   private int AV14Aud_UltL ;
   private int GX_INS1028 ;
   private int A7245Aud_Hdr ;
   private int A7248Aud_UltL ;
   private int GX_INS1029 ;
   private int A7249Aud_Lin ;
   private int A7582Aud_Num ;
   private String A396EmprCod ;
   private String A7188Aui_codpar ;
   private String scmdbuf ;
   private String A7419Aui_UsuAud ;
   private String W396EmprCod ;
   private String A7247Aud_Hdrp ;
   private String Gx_emsg ;
   private String A7250Aud_Usur ;
   private String A7251Aud_Tip ;
   private String AV19Aud_Ob ;
   private java.util.Date A7418Aui_FecAud ;
   private java.util.Date A7252Aud_Fec ;
   private boolean returnInSub ;
   private boolean n7193Aui_Obs ;
   private boolean n7419Aui_UsuAud ;
   private boolean n7418Aui_FecAud ;
   private boolean n7248Aud_UltL ;
   private boolean n7250Aud_Usur ;
   private boolean n7251Aud_Tip ;
   private boolean n7253Aud_Obs ;
   private boolean n7252Aud_Fec ;
   private boolean n7582Aud_Num ;
   private String A7193Aui_Obs ;
   private String A7253Aud_Obs ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02YT2_A396EmprCod ;
   private int[] P02YT2_A7186Aui_barcod ;
   private byte[] P02YT2_A7187Aui_codreo ;
   private String[] P02YT2_A7188Aui_codpar ;
   private short[] P02YT2_A7417Aui_NumAud ;
   private short[] P02YT2_A7182Auc_CodDef ;
   private String[] P02YT3_A7193Aui_Obs ;
   private boolean[] P02YT3_n7193Aui_Obs ;
   private String[] P02YT3_A396EmprCod ;
   private int[] P02YT3_A7186Aui_barcod ;
   private byte[] P02YT3_A7187Aui_codreo ;
   private String[] P02YT3_A7188Aui_codpar ;
   private short[] P02YT3_A7417Aui_NumAud ;
   private String[] P02YT3_A7419Aui_UsuAud ;
   private boolean[] P02YT3_n7419Aui_UsuAud ;
   private java.util.Date[] P02YT3_A7418Aui_FecAud ;
   private boolean[] P02YT3_n7418Aui_FecAud ;
   private String[] P02YT5_A396EmprCod ;
   private int[] P02YT5_A7245Aud_Hdr ;
   private byte[] P02YT5_A7246Aud_Hdrr ;
   private String[] P02YT5_A7247Aud_Hdrp ;
   private int[] P02YT5_A7248Aud_UltL ;
   private boolean[] P02YT5_n7248Aud_UltL ;
}

final  class pobsaui__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02YT2", "SELECT EmprCod, Aui_barcod, Aui_codreo, Aui_codpar, Aui_NumAud, Auc_CodDef FROM TXPAUDIN1 WHERE EmprCod = ? and Aui_barcod = ? and Aui_codreo = ? and Aui_codpar = ? and Aui_NumAud = ? ORDER BY EmprCod, Aui_barcod, Aui_codreo, Aui_codpar, Aui_NumAud, Auc_CodDef ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02YT3", "SELECT Aui_Obs, EmprCod, Aui_barcod, Aui_codreo, Aui_codpar, Aui_NumAud, Aui_UsuAud, Aui_FecAud FROM TXPAUDINT WHERE EmprCod = ? and Aui_barcod = ? and Aui_codreo = ? and Aui_codpar = ? and Aui_NumAud = ? ORDER BY EmprCod, Aui_barcod, Aui_codreo, Aui_codpar, Aui_NumAud ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02YT4", "INSERT INTO TXPAUDOPO(EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp, Aud_UltL) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDOPO")
         ,new ForEachCursor("P02YT5", "SELECT EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp, Aud_UltL FROM TXPAUDOPO WHERE EmprCod = ? and Aud_Hdr = ? and Aud_Hdrr = ? and Aud_Hdrp = ? ORDER BY EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02YT6", "UPDATE TXPAUDOPO SET Aud_UltL=?  WHERE EmprCod = ? AND Aud_Hdr = ? AND Aud_Hdrr = ? AND Aud_Hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDOPO")
         ,new UpdateCursor("P02YT7", "INSERT INTO TXPAUDOP1(EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp, Aud_Lin, Aud_Usur, Aud_Tip, Aud_Fec, Aud_Obs, Aud_Num) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDOP1")
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 3 :
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               return;
            case 4 :
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
            case 5 :
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

