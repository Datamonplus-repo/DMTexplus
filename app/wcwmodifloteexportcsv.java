package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwmodifloteexportcsv", "/app.wcwmodifloteexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwmodifloteexportcsv extends GXWebObjectStub
{
   public wcwmodifloteexportcsv( )
   {
   }

   public wcwmodifloteexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwmodifloteexportcsv.class ));
   }

   public wcwmodifloteexportcsv( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwmodifloteexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwmodifloteexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCw Modif Lote Export CSV";
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

