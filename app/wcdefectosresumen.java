package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcdefectosresumen", "/app.wcdefectosresumen"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcdefectosresumen extends GXWebObjectStub
{
   public wcdefectosresumen( )
   {
   }

   public wcdefectosresumen( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcdefectosresumen.class ));
   }

   public wcdefectosresumen( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcdefectosresumen_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcdefectosresumen_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCDefectos Resumen";
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

