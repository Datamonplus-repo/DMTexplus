package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phornet extends GXProcedure
{
   public phornet( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phornet.class ), "" );
   }

   public phornet( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( byte[] aP0 ,
                                           byte[] aP1 ,
                                           byte[] aP2 ,
                                           byte[] aP3 )
   {
      phornet.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( byte[] aP0 ,
                        byte[] aP1 ,
                        byte[] aP2 ,
                        byte[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( byte[] aP0 ,
                             byte[] aP1 ,
                             byte[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      phornet.this.AV8HHini = aP0[0];
      this.aP0 = aP0;
      phornet.this.AV9MMini = aP1[0];
      this.aP1 = aP1;
      phornet.this.AV10HHFin = aP2[0];
      this.aP2 = aP2;
      phornet.this.AV11MMFin = aP3[0];
      this.aP3 = aP3;
      phornet.this.AV12HorNet = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Inicio = (byte)(AV8HHini*60+AV9MMini) ;
      AV16Final = (byte)(AV10HHFin*60+AV11MMFin) ;
      AV17Horacero = (short)(1440) ;
      if ( AV15Inicio <= AV16Final )
      {
         AV18Jornada = (byte)(AV16Final-AV15Inicio) ;
      }
      else
      {
         AV18Jornada = (byte)(AV17Horacero-AV15Inicio+AV16Final) ;
      }
      AV12HorNet = GXutil.roundDecimal( DecimalUtil.doubleToDec(AV18Jornada/ (double) (60)), 2) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phornet.this.AV8HHini;
      this.aP1[0] = phornet.this.AV9MMini;
      this.aP2[0] = phornet.this.AV10HHFin;
      this.aP3[0] = phornet.this.AV11MMFin;
      this.aP4[0] = phornet.this.AV12HorNet;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8HHini ;
   private byte AV9MMini ;
   private byte AV10HHFin ;
   private byte AV11MMFin ;
   private byte AV15Inicio ;
   private byte AV16Final ;
   private byte AV18Jornada ;
   private short AV17Horacero ;
   private short Gx_err ;
   private java.math.BigDecimal AV12HorNet ;
   private java.math.BigDecimal[] aP4 ;
   private byte[] aP0 ;
   private byte[] aP1 ;
   private byte[] aP2 ;
   private byte[] aP3 ;
}

