package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprdaux extends GXProcedure
{
   public pprdaux( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprdaux.class ), "" );
   }

   public pprdaux( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           byte[] aP2 ,
                           byte[] aP3 )
   {
      pprdaux.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 )
   {
      pprdaux.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprdaux.this.A6310Lb_TaAuxC = aP1[0];
      this.aP1 = aP1;
      pprdaux.this.AV9Lb_famc1 = aP2[0];
      this.aP2 = aP2;
      pprdaux.this.AV10Lb_famc2 = aP3[0];
      this.aP3 = aP3;
      pprdaux.this.AV11Lb_famc3 = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV12Kohler ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KOHLER", ""), GXv_int2) ;
      pprdaux.this.GXt_int1 = GXv_int2[0] ;
      AV12Kohler = GXt_int1 ;
      AV13Ens005 = (byte)(0) ;
      AV9Lb_famc1 = (byte)(0) ;
      AV10Lb_famc2 = (byte)(0) ;
      AV11Lb_famc3 = (byte)(0) ;
      /* Using cursor P02FM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A6310Lb_TaAuxC});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6596Lb_TaAuxf1 = P02FM2_A6596Lb_TaAuxf1[0] ;
         A6597Lb_TaAuxf2 = P02FM2_A6597Lb_TaAuxf2[0] ;
         A6598Lb_TaAuxf3 = P02FM2_A6598Lb_TaAuxf3[0] ;
         AV13Ens005 = (byte)(1) ;
         if ( ( GXutil.strcmp(A6310Lb_TaAuxC, "1") == 0 ) && ( AV12Kohler == 1 ) )
         {
            AV9Lb_famc1 = (byte)(21) ;
            AV10Lb_famc2 = (byte)(22) ;
            AV11Lb_famc3 = (byte)(23) ;
         }
         if ( ( GXutil.strcmp(A6310Lb_TaAuxC, "2") == 0 ) && ( AV12Kohler == 1 ) )
         {
            AV9Lb_famc1 = (byte)(22) ;
            AV10Lb_famc2 = (byte)(0) ;
            AV11Lb_famc3 = (byte)(0) ;
         }
         if ( A6596Lb_TaAuxf1 > 0 )
         {
            AV9Lb_famc1 = A6596Lb_TaAuxf1 ;
         }
         if ( A6597Lb_TaAuxf2 > 0 )
         {
            AV10Lb_famc2 = A6597Lb_TaAuxf2 ;
         }
         if ( A6598Lb_TaAuxf3 > 0 )
         {
            AV11Lb_famc3 = A6598Lb_TaAuxf3 ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprdaux.this.A396EmprCod;
      this.aP1[0] = pprdaux.this.A6310Lb_TaAuxC;
      this.aP2[0] = pprdaux.this.AV9Lb_famc1;
      this.aP3[0] = pprdaux.this.AV10Lb_famc2;
      this.aP4[0] = pprdaux.this.AV11Lb_famc3;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P02FM2_A396EmprCod = new String[] {""} ;
      P02FM2_A6310Lb_TaAuxC = new String[] {""} ;
      P02FM2_A6596Lb_TaAuxf1 = new byte[1] ;
      P02FM2_A6597Lb_TaAuxf2 = new byte[1] ;
      P02FM2_A6598Lb_TaAuxf3 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprdaux__default(),
         new Object[] {
             new Object[] {
            P02FM2_A396EmprCod, P02FM2_A6310Lb_TaAuxC, P02FM2_A6596Lb_TaAuxf1, P02FM2_A6597Lb_TaAuxf2, P02FM2_A6598Lb_TaAuxf3
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Lb_famc1 ;
   private byte AV10Lb_famc2 ;
   private byte AV11Lb_famc3 ;
   private byte AV12Kohler ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV13Ens005 ;
   private byte A6596Lb_TaAuxf1 ;
   private byte A6597Lb_TaAuxf2 ;
   private byte A6598Lb_TaAuxf3 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A6310Lb_TaAuxC ;
   private String scmdbuf ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private byte[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02FM2_A396EmprCod ;
   private String[] P02FM2_A6310Lb_TaAuxC ;
   private byte[] P02FM2_A6596Lb_TaAuxf1 ;
   private byte[] P02FM2_A6597Lb_TaAuxf2 ;
   private byte[] P02FM2_A6598Lb_TaAuxf3 ;
}

final  class pprdaux__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02FM2", "SELECT EmprCod, Lb_TaAuxC, Lb_TaAuxf1, Lb_TaAuxf2, Lb_TaAuxf3 FROM TXPENS005 WHERE EmprCod = ? and Lb_TaAuxC = ? ORDER BY EmprCod, Lb_TaAuxC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
      }
   }

}

