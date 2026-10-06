package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcolortocolor extends GXProcedure
{
   public pcolortocolor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcolortocolor.class ), "" );
   }

   public pcolortocolor( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pcolortocolor.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pcolortocolor.this.AV8Forcolnom = aP0[0];
      this.aP0 = aP0;
      pcolortocolor.this.AV9ForColnom2 = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9ForColnom2 = AV8Forcolnom ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcolortocolor.this.AV8Forcolnom;
      this.aP1[0] = pcolortocolor.this.AV9ForColnom2;
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
   private String AV8Forcolnom ;
   private String AV9ForColnom2 ;
   private String[] aP1 ;
   private String[] aP0 ;
}

