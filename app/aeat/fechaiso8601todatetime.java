package app.aeat ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class fechaiso8601todatetime extends GXProcedure
{
   public fechaiso8601todatetime( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( fechaiso8601todatetime.class ), "" );
   }

   public fechaiso8601todatetime( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 )
   {
      fechaiso8601todatetime.this.aP1 = new java.util.Date[] {GXutil.nullDate()};
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
      fechaiso8601todatetime.this.AV8FechaISO8601 = aP0;
      fechaiso8601todatetime.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Anualidad = (short)(GXutil.lval( GXutil.substring( AV8FechaISO8601, 1, 4))) ;
      AV11Mes = (short)(GXutil.lval( GXutil.substring( AV8FechaISO8601, 6, 2))) ;
      AV12Dia = (short)(GXutil.lval( GXutil.substring( AV8FechaISO8601, 9, 2))) ;
      AV13Hora = (short)(GXutil.lval( GXutil.substring( AV8FechaISO8601, 12, 2))) ;
      AV14Minutos = (short)(GXutil.lval( GXutil.substring( AV8FechaISO8601, 15, 2))) ;
      AV15Segundos = (short)(GXutil.lval( GXutil.substring( AV8FechaISO8601, 18, 2))) ;
      AV9FechaHora = localUtil.ymdhmsToT( AV10Anualidad, (byte)(AV11Mes), (byte)(AV12Dia), (byte)(AV13Hora), (byte)(AV14Minutos), (byte)(AV15Segundos)) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = fechaiso8601todatetime.this.AV9FechaHora;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9FechaHora = GXutil.resetTime( GXutil.nullDate() );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10Anualidad ;
   private short AV11Mes ;
   private short AV12Dia ;
   private short AV13Hora ;
   private short AV14Minutos ;
   private short AV15Segundos ;
   private short Gx_err ;
   private java.util.Date AV9FechaHora ;
   private String AV8FechaISO8601 ;
   private java.util.Date[] aP1 ;
}

