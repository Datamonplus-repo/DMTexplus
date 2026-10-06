package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class at extends GXProcedure
{
   public at( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( at.class ), "" );
   }

   public at( int remoteHandle ,
              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            String aP1 ,
                            short aP2 )
   {
      at.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short aP2 ,
                             short[] aP3 )
   {
      at.this.AV10InString1 = aP0;
      at.this.AV11InString2 = aP1;
      at.this.AV12InInt = aP2;
      at.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8OutInt = (short)(GXutil.strSearch( AV10InString1, AV11InString2, 1)+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = at.this.AV8OutInt;
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

   private short AV12InInt ;
   private short AV8OutInt ;
   private short Gx_err ;
   private String AV10InString1 ;
   private String AV11InString2 ;
   private short[] aP3 ;
}

