package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptrz001 extends GXProcedure
{
   public ptrz001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptrz001.class ), "" );
   }

   public ptrz001( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 )
   {
      ptrz001.this.aP1 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        java.util.Date[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             java.util.Date[] aP1 )
   {
      ptrz001.this.A396EmprCod = aP0;
      ptrz001.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV10Masmm ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "MASMM", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      ptrz001.this.A396EmprCod = GXv_char2[0] ;
      ptrz001.this.GXt_int1 = GXv_int4[0] ;
      AV10Masmm = (short)(GXt_int1) ;
      AV11Aux0 = (short)(AV10Masmm*60) ;
      AV9VarAux0 = GXutil.dtadd( GXutil.serverNow( context, remoteHandle, pr_default), AV11Aux0) ;
      AV12Horasal = localUtil.ttoc( AV9VarAux0, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = ptrz001.this.AV9VarAux0;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      AV12Horasal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ptrz001__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10Masmm ;
   private short AV11Aux0 ;
   private short Gx_err ;
   private int GXt_int1 ;
   private int GXv_int4[] ;
   private String A396EmprCod ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV12Horasal ;
   private java.util.Date AV9VarAux0 ;
   private java.util.Date[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class ptrz001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

