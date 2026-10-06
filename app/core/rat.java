package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rat extends GXProcedure
{
   public rat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rat.class ), "" );
   }

   public rat( int remoteHandle ,
               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            String aP1 ,
                            short aP2 )
   {
      rat.this.aP3 = new short[] {0};
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
      rat.this.AV8InString = aP0;
      rat.this.AV10InString2 = aP1;
      rat.this.AV11InInt = aP2;
      rat.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9OutInt = (short)(GXutil.strSearchRev( AV8InString, AV10InString2, AV11InInt)+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = rat.this.AV9OutInt;
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

   private short AV11InInt ;
   private short AV9OutInt ;
   private short Gx_err ;
   private String AV8InString ;
   private String AV10InString2 ;
   private short[] aP3 ;
}

