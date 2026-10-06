package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precnot extends GXProcedure
{
   public precnot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precnot.class ), "" );
   }

   public precnot( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      precnot.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      precnot.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      precnot.this.A5206Nr_albrecc = aP1[0];
      this.aP1 = aP1;
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
      this.aP0[0] = precnot.this.A396EmprCod;
      this.aP1[0] = precnot.this.A5206Nr_albrecc;
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

   private short Gx_err ;
   private int A5206Nr_albrecc ;
   private String A396EmprCod ;
   private int[] aP1 ;
   private String[] aP0 ;
}

