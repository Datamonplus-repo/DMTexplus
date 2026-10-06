package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.activarhdr_wcexportcsv", "/app.activarhdr_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class activarhdr_wcexportcsv extends GXWebObjectStub
{
   public activarhdr_wcexportcsv( )
   {
   }

   public activarhdr_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( activarhdr_wcexportcsv.class ));
   }

   public activarhdr_wcexportcsv( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new activarhdr_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new activarhdr_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Activar Hdr_WCExport CSV";
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

