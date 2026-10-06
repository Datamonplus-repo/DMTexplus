package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbufedic extends GXProcedure
{
   public pbufedic( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbufedic.class ), "" );
   }

   public pbufedic( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      pbufedic.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pbufedic.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbufedic.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbufedic.this.AV16EstCol = aP2[0];
      this.aP2 = aP2;
      pbufedic.this.AV15Flag = aP3[0];
      this.aP3 = aP3;
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
      this.aP0[0] = pbufedic.this.A396EmprCod;
      this.aP1[0] = pbufedic.this.A252CliCod;
      this.aP2[0] = pbufedic.this.AV16EstCol;
      this.aP3[0] = pbufedic.this.AV15Flag;
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

   private byte AV15Flag ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV16EstCol ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
}

