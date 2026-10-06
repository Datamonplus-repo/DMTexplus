package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc227 extends GXProcedure
{
   public pprc227( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc227.class ), "" );
   }

   public pprc227( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( short[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      pprc227.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( short[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( short[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pprc227.this.AV8MatCod = aP0[0];
      this.aP0 = aP0;
      pprc227.this.AV9AtMatCod = aP1[0];
      this.aP1 = aP1;
      pprc227.this.AV10lb_colnom = aP2[0];
      this.aP2 = aP2;
      pprc227.this.AV11Atlb_colnom = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Atlb_colnom = AV10lb_colnom ;
      AV9AtMatCod = AV8MatCod ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc227.this.AV8MatCod;
      this.aP1[0] = pprc227.this.AV9AtMatCod;
      this.aP2[0] = pprc227.this.AV10lb_colnom;
      this.aP3[0] = pprc227.this.AV11Atlb_colnom;
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

   private short AV8MatCod ;
   private short AV9AtMatCod ;
   private short Gx_err ;
   private String AV10lb_colnom ;
   private String AV11Atlb_colnom ;
   private String[] aP3 ;
   private short[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
}

