package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partmat extends GXProcedure
{
   public partmat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partmat.class ), "" );
   }

   public partmat( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 )
   {
      partmat.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      partmat.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partmat.this.AV14ForSer = aP1[0];
      this.aP1 = aP1;
      partmat.this.AV15MatCod = aP2[0];
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
      this.aP0[0] = partmat.this.A396EmprCod;
      this.aP1[0] = partmat.this.AV14ForSer;
      this.aP2[0] = partmat.this.AV15MatCod;
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

   private short AV15MatCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV14ForSer ;
   private short[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
}

