package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmcomprawwexportcsv", "/app.tmcomprawwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmcomprawwexportcsv extends GXWebObjectStub
{
   public tmcomprawwexportcsv( )
   {
   }

   public tmcomprawwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmcomprawwexportcsv.class ));
   }

   public tmcomprawwexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmcomprawwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmcomprawwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMCompra WWExport CSV";
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

