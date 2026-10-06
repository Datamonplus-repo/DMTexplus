package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dis_distipcol_asignar extends GXProcedure
{
   public dis_distipcol_asignar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dis_distipcol_asignar.class ), "" );
   }

   public dis_distipcol_asignar( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( byte aP0 )
   {
      dis_distipcol_asignar.this.aP1 = new byte[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( byte aP0 ,
                        byte[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( byte aP0 ,
                             byte[] aP1 )
   {
      dis_distipcol_asignar.this.AV8DisTipCol = aP0;
      dis_distipcol_asignar.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      A390DisTipCol = AV8DisTipCol ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dis_distipcol_asignar.this.A390DisTipCol;
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

   private byte AV8DisTipCol ;
   private byte A390DisTipCol ;
   private short Gx_err ;
   private byte[] aP1 ;
}

