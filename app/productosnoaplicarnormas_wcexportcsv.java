package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.productosnoaplicarnormas_wcexportcsv", "/app.productosnoaplicarnormas_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosnoaplicarnormas_wcexportcsv extends GXWebObjectStub
{
   public productosnoaplicarnormas_wcexportcsv( )
   {
   }

   public productosnoaplicarnormas_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosnoaplicarnormas_wcexportcsv.class ));
   }

   public productosnoaplicarnormas_wcexportcsv( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosnoaplicarnormas_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosnoaplicarnormas_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos NOaplicar Normas_WCExport CSV";
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

