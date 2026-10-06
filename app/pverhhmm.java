package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pverhhmm extends GXProcedure
{
   public pverhhmm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pverhhmm.class ), "" );
   }

   public pverhhmm( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pverhhmm.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pverhhmm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pverhhmm.this.AV19Tiempo = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Hisprodti = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV20Hisprodtia = localUtil.ttoc( AV17Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV18Horcar = GXutil.substring( AV20Hisprodtia, 10, 2) + ":" + GXutil.substring( AV20Hisprodtia, 13, 2) + ":" + GXutil.substring( AV20Hisprodtia, 16, 2) ;
      AV19Tiempo = AV18Horcar ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pverhhmm.this.A396EmprCod;
      this.aP1[0] = pverhhmm.this.AV19Tiempo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV20Hisprodtia = "" ;
      AV18Horcar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pverhhmm__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String AV19Tiempo ;
   private String AV20Hisprodtia ;
   private String AV18Horcar ;
   private java.util.Date AV17Hisprodti ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
}

final  class pverhhmm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

