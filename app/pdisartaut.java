package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisartaut extends GXProcedure
{
   public pdisartaut( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisartaut.class ), "" );
   }

   public pdisartaut( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 )
   {
      pdisartaut.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pdisartaut.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisartaut.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdisartaut.this.AV8DisFasAut = aP2[0];
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
      this.aP0[0] = pdisartaut.this.A396EmprCod;
      this.aP1[0] = pdisartaut.this.A361DisCod;
      this.aP2[0] = pdisartaut.this.AV8DisFasAut;
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

   private byte AV8DisFasAut ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
}

