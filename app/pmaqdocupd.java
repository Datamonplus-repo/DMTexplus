package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmaqdocupd extends GXProcedure
{
   public pmaqdocupd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmaqdocupd.class ), "" );
   }

   public pmaqdocupd( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      pmaqdocupd.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      pmaqdocupd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmaqdocupd.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      pmaqdocupd.this.A11432MaqDocId = aP2[0];
      this.aP2 = aP2;
      pmaqdocupd.this.AV8Modo = aP3[0];
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
      this.aP0[0] = pmaqdocupd.this.A396EmprCod;
      this.aP1[0] = pmaqdocupd.this.A602MaqCod;
      this.aP2[0] = pmaqdocupd.this.A11432MaqDocId;
      this.aP3[0] = pmaqdocupd.this.AV8Modo;
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

   private short A11432MaqDocId ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV8Modo ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
}

