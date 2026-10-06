package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbart1 extends GXProcedure
{
   public palbart1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbart1.class ), "" );
   }

   public palbart1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           long[] aP1 )
   {
      palbart1.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             byte[] aP2 )
   {
      palbart1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbart1.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      palbart1.this.AV20Opc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbart1.this.A396EmprCod;
      this.aP1[0] = palbart1.this.A30AlbProCod;
      this.aP2[0] = palbart1.this.AV20Opc;
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

   private byte AV20Opc ;
   private short Gx_err ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
}

