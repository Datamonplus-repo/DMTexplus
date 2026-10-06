package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcentar extends GXProcedure
{
   public pcentar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcentar.class ), "" );
   }

   public pcentar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           byte[] aP1 ,
                           byte[] aP2 ,
                           byte[] aP3 ,
                           String[] aP4 )
   {
      pcentar.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        byte[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             byte[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      pcentar.this.AV15VTEXT = aP0[0];
      this.aP0 = aP0;
      pcentar.this.AV16CENT = aP1[0];
      this.aP1 = aP1;
      pcentar.this.AV17DEC = aP2[0];
      this.aP2 = aP2;
      pcentar.this.AV18UNI = aP3[0];
      this.aP3 = aP3;
      pcentar.this.AV19GENERO = aP4[0];
      this.aP4 = aP4;
      pcentar.this.AV21EmpNumDec = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Deci = GXutil.str( AV17DEC, 1, 0) + GXutil.str( AV18UNI, 1, 0) + "/100" ;
      AV15VTEXT = GXutil.concat( AV15VTEXT, AV22Deci, " ") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcentar.this.AV15VTEXT;
      this.aP1[0] = pcentar.this.AV16CENT;
      this.aP2[0] = pcentar.this.AV17DEC;
      this.aP3[0] = pcentar.this.AV18UNI;
      this.aP4[0] = pcentar.this.AV19GENERO;
      this.aP5[0] = pcentar.this.AV21EmpNumDec;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22Deci = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16CENT ;
   private byte AV17DEC ;
   private byte AV18UNI ;
   private byte AV21EmpNumDec ;
   private short Gx_err ;
   private String AV15VTEXT ;
   private String AV19GENERO ;
   private String AV22Deci ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private byte[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
}

