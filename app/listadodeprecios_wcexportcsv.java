package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.listadodeprecios_wcexportcsv", "/app.listadodeprecios_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodeprecios_wcexportcsv extends GXWebObjectStub
{
   public listadodeprecios_wcexportcsv( )
   {
   }

   public listadodeprecios_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodeprecios_wcexportcsv.class ));
   }

   public listadodeprecios_wcexportcsv( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodeprecios_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodeprecios_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listadode Precios_WCExport CSV";
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

