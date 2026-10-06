package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwuti118_sdt", "/app.wcwuti118_sdt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwuti118_sdt extends GXWebObjectStub
{
   public wcwuti118_sdt( )
   {
   }

   public wcwuti118_sdt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwuti118_sdt.class ));
   }

   public wcwuti118_sdt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwuti118_sdt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwuti118_sdt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWUti118_SDT";
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

