package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class file extends GXProcedure
{
   public file( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( file.class ), "" );
   }

   public file( int remoteHandle ,
                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 )
   {
      file.this.aP1 = new boolean[] {false};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        boolean[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             boolean[] aP1 )
   {
      file.this.AV10path = aP0;
      file.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9file.setSource( AV10path );
      AV8isFile = AV9file.exists() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = file.this.AV8isFile;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9file = new com.genexus.util.GXFile();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private boolean AV8isFile ;
   private String AV10path ;
   private com.genexus.util.GXFile AV9file ;
   private boolean[] aP1 ;
}

