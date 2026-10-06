package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phragr3 extends GXProcedure
{
   public phragr3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phragr3.class ), "" );
   }

   public phragr3( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      phragr3.this.aP1 = new String[] {""};
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
      phragr3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phragr3.this.AV10Horasal = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV11Masmm ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "MASMM", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      phragr3.this.A396EmprCod = GXv_char2[0] ;
      phragr3.this.GXt_int1 = GXv_int4[0] ;
      AV11Masmm = (short)(GXt_int1) ;
      AV8Aux0 = (int)(AV11Masmm*60) ;
      AV9VarAux0 = GXutil.dtadd( GXutil.serverNow( context, remoteHandle, pr_default), AV8Aux0) ;
      AV10Horasal = localUtil.ttoc( AV9VarAux0, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phragr3.this.A396EmprCod;
      this.aP1[0] = phragr3.this.AV10Horasal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      AV9VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phragr3__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11Masmm ;
   private short Gx_err ;
   private int GXt_int1 ;
   private int GXv_int4[] ;
   private int AV8Aux0 ;
   private String A396EmprCod ;
   private String AV10Horasal ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private java.util.Date AV9VarAux0 ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
}

final  class phragr3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

