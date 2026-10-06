package app.aeat ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getfechaiso8601 extends GXProcedure
{
   public getfechaiso8601( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getfechaiso8601.class ), "" );
   }

   public getfechaiso8601( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      getfechaiso8601.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      getfechaiso8601.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8HoraServidor = GXutil.serverNowMs( context, remoteHandle, pr_default) ;
      AV9OffsetMinutes = GXutil.CurrentTimeOffset( ) ;
      AV10Signo = "+" ;
      AV11OffsetAbsoluto = AV9OffsetMinutes ;
      if ( AV9OffsetMinutes < 0 )
      {
         AV10Signo = "-" ;
         AV11OffsetAbsoluto = (short)(-1*AV9OffsetMinutes) ;
      }
      AV12Horas = (byte)(AV11OffsetAbsoluto/ (double) (60)) ;
      AV13Minutos = (byte)(((int)((AV11OffsetAbsoluto) % (60)))) ;
      AV14OffsetCadena = AV10Signo + GXutil.format( "%1:%2", GXutil.padl( GXutil.trim( GXutil.str( AV12Horas, 2, 0)), (short)(2), "00"), GXutil.padl( GXutil.trim( GXutil.str( AV13Minutos, 2, 0)), (short)(2), "00"), "", "", "", "", "", "", "") ;
      AV15FechaISO8601 = GXutil.format( httpContext.getMessage( "%1-%2-%3T%4:%5:%6%7", ""), GXutil.trim( GXutil.str( GXutil.year( AV8HoraServidor), 10, 0)), GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV8HoraServidor), 10, 0)), (short)(2), "00"), GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV8HoraServidor), 10, 0)), (short)(2), "00"), GXutil.padl( GXutil.trim( GXutil.str( GXutil.hour( AV8HoraServidor), 10, 0)), (short)(2), "00"), GXutil.padl( GXutil.trim( GXutil.str( GXutil.minute( AV8HoraServidor), 10, 0)), (short)(2), "00"), GXutil.padl( GXutil.trim( GXutil.str( GXutil.second( AV8HoraServidor), 10, 0)), (short)(2), "00"), AV14OffsetCadena, "", "") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = getfechaiso8601.this.AV15FechaISO8601;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15FechaISO8601 = "" ;
      AV8HoraServidor = GXutil.resetTime( GXutil.nullDate() );
      AV10Signo = "" ;
      AV14OffsetCadena = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aeat.getfechaiso8601__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12Horas ;
   private byte AV13Minutos ;
   private short AV9OffsetMinutes ;
   private short AV11OffsetAbsoluto ;
   private short Gx_err ;
   private java.util.Date AV8HoraServidor ;
   private String AV15FechaISO8601 ;
   private String AV10Signo ;
   private String AV14OffsetCadena ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
}

final  class getfechaiso8601__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

