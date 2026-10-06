package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupdcli extends GXProcedure
{
   public pupdcli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupdcli.class ), "" );
   }

   public pupdcli( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pupdcli.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pupdcli.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pupdcli.this.AV26DisCod = aP1[0];
      this.aP1 = aP1;
      pupdcli.this.AV19CliCod = aP2[0];
      this.aP2 = aP2;
      pupdcli.this.AV27DisArtCod = aP3[0];
      this.aP3 = aP3;
      pupdcli.this.AV32Usurcod = aP4[0];
      this.aP4 = aP4;
      pupdcli.this.AV35Station = aP5[0];
      this.aP5 = aP5;
      pupdcli.this.AV33Pgmnamei = aP6[0];
      this.aP6 = aP6;
      pupdcli.this.AV39Tabla = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV37F_laundry ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LAUNDR", ""), GXv_int2) ;
      pupdcli.this.GXt_int1 = GXv_int2[0] ;
      AV37F_laundry = GXt_int1 ;
      GXt_char3 = AV29Msg_1 ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN129", ""), (byte)(99), GXv_char4) ;
      pupdcli.this.GXt_char3 = GXv_char4[0] ;
      AV29Msg_1 = GXt_char3 ;
      /* Using cursor P01YS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV19CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P01YS2_A252CliCod[0] ;
         n252CliCod = P01YS2_n252CliCod[0] ;
         A279CliNom = P01YS2_A279CliNom[0] ;
         AV23ExisCli = httpContext.getMessage( "S", "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV23ExisCli, httpContext.getMessage( "S", "")) != 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe cliente", ""));
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV28ExisArtcod = httpContext.getMessage( "N", "") ;
      /* Using cursor P01YS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV19CliCod), AV27DisArtCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A65ArtCod = P01YS3_A65ArtCod[0] ;
         A252CliCod = P01YS3_A252CliCod[0] ;
         n252CliCod = P01YS3_n252CliCod[0] ;
         AV28ExisArtcod = httpContext.getMessage( "S", "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( GXutil.strcmp(AV28ExisArtcod, httpContext.getMessage( "N", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(AV29Msg_1);
         if ( AV37F_laundry == 0 )
         {
            AV36DisArtOpe = "XX" ;
         }
         else
         {
            AV36DisArtOpe = httpContext.getMessage( "NO", "") ;
         }
      }
      else
      {
         AV29Msg_1 = "" ;
      }
      /* Using cursor P01YS4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV26DisCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P01YS4_A361DisCod[0] ;
         A369DisFec = P01YS4_A369DisFec[0] ;
         A252CliCod = P01YS4_A252CliCod[0] ;
         n252CliCod = P01YS4_n252CliCod[0] ;
         A341DisArtOpe = P01YS4_A341DisArtOpe[0] ;
         AV31CliCodold = A252CliCod ;
         A252CliCod = AV19CliCod ;
         n252CliCod = false ;
         A341DisArtOpe = AV36DisArtOpe ;
         /* Using cursor P01YS5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A341DisArtOpe, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor P01YS6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV26DisCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A361DisCod = P01YS6_A361DisCod[0] ;
         A44AlbRecCod = P01YS6_A44AlbRecCod[0] ;
         AV30AlbRecCod = A44AlbRecCod ;
         /* Execute user subroutine: 'ALBREC' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( GXutil.strcmp(AV39Tabla, httpContext.getMessage( "B", "")) == 0 )
      {
         n252CliCod = false ;
         /* Optimized UPDATE. */
         /* Using cursor P01YS7 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(AV19CliCod), A396EmprCod, Integer.valueOf(AV26DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* End optimized UPDATE. */
      }
      if ( GXutil.strcmp(AV39Tabla, httpContext.getMessage( "D", "")) == 0 )
      {
         AV34Texto_i = httpContext.getMessage( "Cambio de codigo de cliente", "") + GXutil.newLine( ) + httpContext.getMessage( "Cliente Antiguo = ", "") + GXutil.str( AV31CliCodold, 6, 0) + GXutil.newLine( ) + httpContext.getMessage( "Cliente Nuevo   = ", "") + GXutil.str( AV19CliCod, 6, 0) + GXutil.newLine( ) + httpContext.getMessage( "Programa Encomendas", "") + GXutil.newLine( ) + AV29Msg_1 + GXutil.newLine( ) ;
      }
      else
      {
         AV34Texto_i = httpContext.getMessage( "Cambio de codigo de cliente", "") + GXutil.newLine( ) + httpContext.getMessage( "Cliente Antiguo = ", "") + GXutil.str( AV31CliCodold, 6, 0) + GXutil.newLine( ) + httpContext.getMessage( "Cliente Nuevo   = ", "") + GXutil.str( AV19CliCod, 6, 0) + GXutil.newLine( ) + httpContext.getMessage( "Programa Hdr", "") + GXutil.newLine( ) + AV29Msg_1 + GXutil.newLine( ) ;
      }
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV33Pgmnamei, AV32Usurcod, AV35Station, AV34Texto_i, AV26DisCod, (byte)(0), "") ;
      cleanup();
   }

   public void S111( )
   {
      /* 'ALBREC' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P01YS8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(AV19CliCod), A396EmprCod, Integer.valueOf(AV30AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pupdcli.this.A396EmprCod;
      this.aP1[0] = pupdcli.this.AV26DisCod;
      this.aP2[0] = pupdcli.this.AV19CliCod;
      this.aP3[0] = pupdcli.this.AV27DisArtCod;
      this.aP4[0] = pupdcli.this.AV32Usurcod;
      this.aP5[0] = pupdcli.this.AV35Station;
      this.aP6[0] = pupdcli.this.AV33Pgmnamei;
      this.aP7[0] = pupdcli.this.AV39Tabla;
      Application.commitDataStores(context, remoteHandle, pr_default, "pupdcli");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV29Msg_1 = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P01YS2_A396EmprCod = new String[] {""} ;
      P01YS2_A252CliCod = new int[1] ;
      P01YS2_n252CliCod = new boolean[] {false} ;
      P01YS2_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      AV23ExisCli = "" ;
      AV28ExisArtcod = "" ;
      P01YS3_A396EmprCod = new String[] {""} ;
      P01YS3_A65ArtCod = new String[] {""} ;
      P01YS3_A252CliCod = new int[1] ;
      P01YS3_n252CliCod = new boolean[] {false} ;
      A65ArtCod = "" ;
      AV36DisArtOpe = "" ;
      P01YS4_A396EmprCod = new String[] {""} ;
      P01YS4_A361DisCod = new int[1] ;
      P01YS4_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P01YS4_A252CliCod = new int[1] ;
      P01YS4_n252CliCod = new boolean[] {false} ;
      P01YS4_A341DisArtOpe = new String[] {""} ;
      A369DisFec = GXutil.nullDate() ;
      A341DisArtOpe = "" ;
      P01YS6_A396EmprCod = new String[] {""} ;
      P01YS6_A361DisCod = new int[1] ;
      P01YS6_A44AlbRecCod = new int[1] ;
      AV34Texto_i = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pupdcli__default(),
         new Object[] {
             new Object[] {
            P01YS2_A396EmprCod, P01YS2_A252CliCod, P01YS2_A279CliNom
            }
            , new Object[] {
            P01YS3_A396EmprCod, P01YS3_A65ArtCod, P01YS3_A252CliCod
            }
            , new Object[] {
            P01YS4_A396EmprCod, P01YS4_A361DisCod, P01YS4_A369DisFec, P01YS4_A252CliCod, P01YS4_A341DisArtOpe
            }
            , new Object[] {
            }
            , new Object[] {
            P01YS6_A396EmprCod, P01YS6_A361DisCod, P01YS6_A44AlbRecCod
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

   private byte AV37F_laundry ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int AV26DisCod ;
   private int AV19CliCod ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int AV31CliCodold ;
   private int A44AlbRecCod ;
   private int AV30AlbRecCod ;
   private String A396EmprCod ;
   private String AV27DisArtCod ;
   private String AV32Usurcod ;
   private String AV35Station ;
   private String AV33Pgmnamei ;
   private String AV39Tabla ;
   private String AV29Msg_1 ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String AV23ExisCli ;
   private String AV28ExisArtcod ;
   private String A65ArtCod ;
   private String AV36DisArtOpe ;
   private String A341DisArtOpe ;
   private java.util.Date A369DisFec ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private String AV34Texto_i ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01YS2_A396EmprCod ;
   private int[] P01YS2_A252CliCod ;
   private boolean[] P01YS2_n252CliCod ;
   private String[] P01YS2_A279CliNom ;
   private String[] P01YS3_A396EmprCod ;
   private String[] P01YS3_A65ArtCod ;
   private int[] P01YS3_A252CliCod ;
   private boolean[] P01YS3_n252CliCod ;
   private String[] P01YS4_A396EmprCod ;
   private int[] P01YS4_A361DisCod ;
   private java.util.Date[] P01YS4_A369DisFec ;
   private int[] P01YS4_A252CliCod ;
   private boolean[] P01YS4_n252CliCod ;
   private String[] P01YS4_A341DisArtOpe ;
   private String[] P01YS6_A396EmprCod ;
   private int[] P01YS6_A361DisCod ;
   private int[] P01YS6_A44AlbRecCod ;
}

final  class pupdcli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01YS2", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01YS3", "SELECT EmprCod, ArtCod, CliCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01YS4", "SELECT EmprCod, DisCod, DisFec, CliCod, DisArtOpe FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01YS5", "UPDATE TXPDISPOS SET CliCod=?, DisArtOpe=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P01YS6", "SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01YS7", "UPDATE TXPBARCAD SET CliCod=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P01YS8", "UPDATE TXPALBREC SET CliCod=?  WHERE EmprCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(2, (String)parms[2], 2);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
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
               return;
            case 6 :
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
               return;
      }
   }

}

