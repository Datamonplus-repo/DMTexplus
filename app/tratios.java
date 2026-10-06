package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tratios", "/app.tratios"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tratios extends GXWebObjectStub
{
   public tratios( )
   {
   }

   public tratios( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tratios.class ));
   }

   public tratios( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tratios_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tratios_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MTO. RATIOS (H.S.Segura)";
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

