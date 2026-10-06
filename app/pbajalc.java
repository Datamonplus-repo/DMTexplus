package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbajalc extends GXProcedure
{
   public pbajalc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbajalc.class ), "" );
   }

   public pbajalc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          long[] aP1 )
   {
      pbajalc.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 )
   {
      pbajalc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbajalc.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pbajalc.this.AV12Guiremcli = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pbajalc.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV10EmprNom ;
      GXv_char4[0] = AV11Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      pbajalc.this.A396EmprCod = GXv_char2[0] ;
      pbajalc.this.AV10EmprNom = GXv_char3[0] ;
      pbajalc.this.AV11Usurcod = GXv_char4[0] ;
      /* Using cursor P00HI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1243GuiRemCli = P00HI2_A1243GuiRemCli[0] ;
         A5140AlbMarca = P00HI2_A5140AlbMarca[0] ;
         A14071AlbUsuAnu = P00HI2_A14071AlbUsuAnu[0] ;
         A14070AlbFecAnu = P00HI2_A14070AlbFecAnu[0] ;
         AV8texto_i = httpContext.getMessage( "TALBNOP-ALBARANES PRODUCCION", "") + GXutil.chr( (short)(13)) ;
         AV8texto_i += httpContext.getMessage( "SE ACTIVA UNA GR QUE ESTABA COMO ANULADA", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.chr( (short)(13)) ;
         AV8texto_i += httpContext.getMessage( "Cliente Origen ", "") + GXutil.str( A1243GuiRemCli, 6, 0) + GXutil.chr( (short)(13)) ;
         AV8texto_i += httpContext.getMessage( "Cliente Destino ", "") + GXutil.str( AV12Guiremcli, 6, 0) + GXutil.chr( (short)(13)) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV16Pgmname, AV11Usurcod, AV9Station, AV8texto_i, (int)(A30AlbProCod), (byte)(0), "") ;
         A5140AlbMarca = GXutil.space( (short)(1)) ;
         A1243GuiRemCli = AV12Guiremcli ;
         A14071AlbUsuAnu = "" ;
         A14070AlbFecAnu = GXutil.nullDate() ;
         /* Using cursor P00HI3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A1243GuiRemCli), A5140AlbMarca, A14071AlbUsuAnu, A14070AlbFecAnu, A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbajalc.this.A396EmprCod;
      this.aP1[0] = pbajalc.this.A30AlbProCod;
      this.aP2[0] = pbajalc.this.AV12Guiremcli;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbajalc");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV10EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV11Usurcod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P00HI2_A396EmprCod = new String[] {""} ;
      P00HI2_A30AlbProCod = new long[1] ;
      P00HI2_A1243GuiRemCli = new int[1] ;
      P00HI2_A5140AlbMarca = new String[] {""} ;
      P00HI2_A14071AlbUsuAnu = new String[] {""} ;
      P00HI2_A14070AlbFecAnu = new java.util.Date[] {GXutil.nullDate()} ;
      A5140AlbMarca = "" ;
      A14071AlbUsuAnu = "" ;
      A14070AlbFecAnu = GXutil.nullDate() ;
      AV8texto_i = "" ;
      AV16Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbajalc__default(),
         new Object[] {
             new Object[] {
            P00HI2_A396EmprCod, P00HI2_A30AlbProCod, P00HI2_A1243GuiRemCli, P00HI2_A5140AlbMarca, P00HI2_A14071AlbUsuAnu, P00HI2_A14070AlbFecAnu
            }
            , new Object[] {
            }
         }
      );
      AV16Pgmname = "PBAJALC" ;
      /* GeneXus formulas. */
      AV16Pgmname = "PBAJALC" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV12Guiremcli ;
   private int A1243GuiRemCli ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV9Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV10EmprNom ;
   private String GXv_char3[] ;
   private String AV11Usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A5140AlbMarca ;
   private String A14071AlbUsuAnu ;
   private String AV16Pgmname ;
   private java.util.Date A14070AlbFecAnu ;
   private String AV8texto_i ;
   private int[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00HI2_A396EmprCod ;
   private long[] P00HI2_A30AlbProCod ;
   private int[] P00HI2_A1243GuiRemCli ;
   private String[] P00HI2_A5140AlbMarca ;
   private String[] P00HI2_A14071AlbUsuAnu ;
   private java.util.Date[] P00HI2_A14070AlbFecAnu ;
}

final  class pbajalc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00HI2", "SELECT EmprCod, AlbProCod, GuiRemCli, AlbMarca, AlbUsuAnu, AlbFecAnu FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00HI3", "UPDATE TXPCALPRD SET GuiRemCli=?, AlbMarca=?, AlbUsuAnu=?, AlbFecAnu=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
      }
   }

}

