package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedafn extends GXProcedure
{
   public ppedafn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedafn.class ), "" );
   }

   public ppedafn( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            short[] aP2 )
   {
      ppedafn.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short[] aP2 ,
                             short[] aP3 )
   {
      ppedafn.this.A396EmprCod = aP0;
      ppedafn.this.A11604PArtId = aP1;
      ppedafn.this.aP2 = aP2;
      ppedafn.this.AV9PAFOrd = aP3[0];
      this.aP3 = aP3;
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
      this.aP2[0] = ppedafn.this.AV8PAPUltFas;
      this.aP3[0] = ppedafn.this.AV9PAFOrd;
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

   private short AV8PAPUltFas ;
   private short AV9PAFOrd ;
   private short Gx_err ;
   private int A11604PArtId ;
   private String A396EmprCod ;
   private short[] aP3 ;
   private short[] aP2 ;
}

