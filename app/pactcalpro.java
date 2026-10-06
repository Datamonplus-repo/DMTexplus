package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactcalpro extends GXProcedure
{
   public pactcalpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactcalpro.class ), "" );
   }

   public pactcalpro( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pactcalpro.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pactcalpro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactcalpro.this.A13418AlbProID = aP1[0];
      this.aP1 = aP1;
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
      pactcalpro.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV10EmprNom ;
      GXv_char4[0] = AV11Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      pactcalpro.this.A396EmprCod = GXv_char2[0] ;
      pactcalpro.this.AV10EmprNom = GXv_char3[0] ;
      pactcalpro.this.AV11Usurcod = GXv_char4[0] ;
      /* Using cursor P05ZJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13440AlbProAnul = P05ZJ2_A13440AlbProAnul[0] ;
         AV8texto_i = httpContext.getMessage( "SE ACTIVA UNA GR QUE ESTABA COMO ANULADA", "") + GXutil.str( A13418AlbProID, 8, 0) + GXutil.chr( (short)(13)) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV16Pgmname, AV11Usurcod, AV9Station, AV8texto_i, A13418AlbProID, (byte)(0), "") ;
         A13440AlbProAnul = " " ;
         /* Using cursor P05ZJ3 */
         pr_default.execute(1, new Object[] {A13440AlbProAnul, A396EmprCod, Integer.valueOf(A13418AlbProID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactcalpro.this.A396EmprCod;
      this.aP1[0] = pactcalpro.this.A13418AlbProID;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactcalpro");
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
      P05ZJ2_A396EmprCod = new String[] {""} ;
      P05ZJ2_A13418AlbProID = new int[1] ;
      P05ZJ2_A13440AlbProAnul = new String[] {""} ;
      A13440AlbProAnul = "" ;
      AV8texto_i = "" ;
      AV16Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactcalpro__default(),
         new Object[] {
             new Object[] {
            P05ZJ2_A396EmprCod, P05ZJ2_A13418AlbProID, P05ZJ2_A13440AlbProAnul
            }
            , new Object[] {
            }
         }
      );
      AV16Pgmname = "PActCALPRO" ;
      /* GeneXus formulas. */
      AV16Pgmname = "PActCALPRO" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A13418AlbProID ;
   private String A396EmprCod ;
   private String AV9Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV10EmprNom ;
   private String GXv_char3[] ;
   private String AV11Usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A13440AlbProAnul ;
   private String AV16Pgmname ;
   private String AV8texto_i ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P05ZJ2_A396EmprCod ;
   private int[] P05ZJ2_A13418AlbProID ;
   private String[] P05ZJ2_A13440AlbProAnul ;
}

final  class pactcalpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05ZJ2", "SELECT EmprCod, AlbProID, AlbProAnul FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05ZJ3", "UPDATE TXPCALPRO SET AlbProAnul=?  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRO")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

