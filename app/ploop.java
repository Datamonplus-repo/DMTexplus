package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ploop extends GXProcedure
{
   public ploop( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ploop.class ), "" );
   }

   public ploop( int remoteHandle ,
                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( int[] aP0 )
   {
      ploop.this.aP1 = new byte[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( int[] aP0 ,
                        byte[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( int[] aP0 ,
                             byte[] aP1 )
   {
      ploop.this.AV15Duracion = aP0[0];
      this.aP0 = aP0;
      ploop.this.AV16Loop = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Contador = 0 ;
      while ( AV17Contador < AV15Duracion )
      {
         AV17Contador = (int)(AV17Contador+1) ;
      }
      AV16Loop = (byte)(1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ploop.this.AV15Duracion;
      this.aP1[0] = ploop.this.AV16Loop;
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

   private byte AV16Loop ;
   private short Gx_err ;
   private int AV15Duracion ;
   private int AV17Contador ;
   private byte[] aP1 ;
   private int[] aP0 ;
}

