package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tldes03", "/app.tldes03"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tldes03 extends GXWebObjectStub
{
   public tldes03( )
   {
   }

   public tldes03( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tldes03.class ));
   }

   public tldes03( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tldes03_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tldes03_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lab DIP Estampacion (Combinaciones)";
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

