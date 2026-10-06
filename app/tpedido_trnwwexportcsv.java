package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpedido_trnwwexportcsv", "/app.tpedido_trnwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedido_trnwwexportcsv extends GXWebObjectStub
{
   public tpedido_trnwwexportcsv( )
   {
   }

   public tpedido_trnwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedido_trnwwexportcsv.class ));
   }

   public tpedido_trnwwexportcsv( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedido_trnwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedido_trnwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPEDIDO_Trn WWExport CSV";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

