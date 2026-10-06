package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptipdis extends GXProcedure
{
   public ptipdis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptipdis.class ), "" );
   }

   public ptipdis( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      ptipdis.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      ptipdis.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptipdis.this.AV18Tipdiscod = aP1[0];
      this.aP1 = aP1;
      ptipdis.this.AV20Discod = aP2[0];
      this.aP2 = aP2;
      ptipdis.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Contcod = " " ;
      Gx_msg = " " ;
      /* Using cursor P03S82 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV18Tipdiscod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5098TipDisCod = P03S82_A5098TipDisCod[0] ;
         A5097TipDisDsc = P03S82_A5097TipDisDsc[0] ;
         n5097TipDisDsc = P03S82_n5097TipDisDsc[0] ;
         AV19Contcod = GXutil.substring( A5097TipDisDsc, 1, 2) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ! ( ( GXutil.strcmp(GXutil.substring( AV19Contcod, 1, 2), httpContext.getMessage( "AC", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( AV19Contcod, 1, 2), httpContext.getMessage( "TH", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( AV19Contcod, 1, 2), httpContext.getMessage( "TE", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( AV19Contcod, 1, 2), httpContext.getMessage( "TF", "")) == 0 ) ) )
      {
         Gx_msg = httpContext.getMessage( "Atencion. Las descripciones que pueden ser son", "") + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "AC-Teñido Tejido, TH-Teñido HILO, TE-Tejeduria", "") + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "TF-Teñido Fibra", "") + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Debe de ir al Mantenimiento , TTIPDIS", "") + GXutil.chr( (short)(13)) ;
      }
      else
      {
         GXv_int1[0] = AV20Discod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV19Contcod, GXv_int1) ;
         ptipdis.this.AV20Discod = GXv_int1[0] ;
         Gx_msg = " " ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptipdis.this.A396EmprCod;
      this.aP1[0] = ptipdis.this.AV18Tipdiscod;
      this.aP2[0] = ptipdis.this.AV20Discod;
      this.aP3[0] = ptipdis.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19Contcod = "" ;
      scmdbuf = "" ;
      P03S82_A396EmprCod = new String[] {""} ;
      P03S82_A5098TipDisCod = new String[] {""} ;
      P03S82_A5097TipDisDsc = new String[] {""} ;
      P03S82_n5097TipDisDsc = new boolean[] {false} ;
      A5098TipDisCod = "" ;
      A5097TipDisDsc = "" ;
      GXv_int1 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptipdis__default(),
         new Object[] {
             new Object[] {
            P03S82_A396EmprCod, P03S82_A5098TipDisCod, P03S82_A5097TipDisDsc, P03S82_n5097TipDisDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV20Discod ;
   private int GXv_int1[] ;
   private String A396EmprCod ;
   private String AV18Tipdiscod ;
   private String Gx_msg ;
   private String AV19Contcod ;
   private String scmdbuf ;
   private String A5098TipDisCod ;
   private String A5097TipDisDsc ;
   private boolean n5097TipDisDsc ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P03S82_A396EmprCod ;
   private String[] P03S82_A5098TipDisCod ;
   private String[] P03S82_A5097TipDisDsc ;
   private boolean[] P03S82_n5097TipDisDsc ;
}

final  class ptipdis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03S82", "SELECT EmprCod, TipDisCod, TipDisDsc FROM TXPTIPDIS WHERE EmprCod = ? and TipDisCod = ? ORDER BY EmprCod, TipDisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 1);
               return;
      }
   }

}

