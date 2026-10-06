package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ascan extends GXProcedure
{
   public ascan( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ascan.class ), "" );
   }

   public ascan( int remoteHandle ,
                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] AV8CharacterVector ,
                            String aP1 )
   {
      ascan.this.aP2 = new short[] {0};
      execute_int(AV8CharacterVector, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] AV8CharacterVector ,
                        String aP1 ,
                        short[] aP2 )
   {
      execute_int(AV8CharacterVector, aP1, aP2);
   }

   private void execute_int( String[] AV8CharacterVector ,
                             String aP1 ,
                             short[] aP2 )
   {
      ascan.this.AV8CharacterVector = AV8CharacterVector;
      ascan.this.AV9Barcode = aP1;
      ascan.this.aP2 = aP2;
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
      this.aP2[0] = ascan.this.AV11OUtInt;
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

   private short AV11OUtInt ;
   private short Gx_err ;
   private String AV8CharacterVector[] ;
   private String AV9Barcode ;
   private short[] aP2 ;
}

