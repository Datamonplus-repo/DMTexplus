package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmpreveview", "/app.tmpreveview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmpreveview extends GXWebObjectStub
{
   public tmpreveview( )
   {
   }

   public tmpreveview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmpreveview.class ));
   }

   public tmpreveview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmpreveview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmpreveview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMPreve View";
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

