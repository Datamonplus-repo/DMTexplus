package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcomtop extends GXProcedure
{
   public pcomtop( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcomtop.class ), "" );
   }

   public pcomtop( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pcomtop.this.aP1 = new String[] {""};
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
      pcomtop.this.AV15StrCom = aP0[0];
      this.aP0 = aP0;
      pcomtop.this.AV16StrPunt = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Contador = (byte)(0) ;
      AV19StrInt = AV15StrCom ;
      AV16StrPunt = "" ;
      while ( AV17Contador != 11 )
      {
         AV17Contador = (byte)(AV17Contador+1) ;
         AV18car = GXutil.substring( AV19StrInt, 1, 1) ;
         AV19StrInt = GXutil.substring( AV19StrInt, 2, 11) ;
         if ( GXutil.strcmp(AV18car, ",") == 0 )
         {
            AV18car = "." ;
         }
         AV16StrPunt = GXutil.concat( AV16StrPunt, AV18car, "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcomtop.this.AV15StrCom;
      this.aP1[0] = pcomtop.this.AV16StrPunt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19StrInt = "" ;
      AV18car = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Contador ;
   private short Gx_err ;
   private String AV15StrCom ;
   private String AV16StrPunt ;
   private String AV19StrInt ;
   private String AV18car ;
   private String[] aP1 ;
   private String[] aP0 ;
}

