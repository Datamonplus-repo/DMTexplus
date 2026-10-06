package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tforctr", "/app.formulaciontinte.tforctr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tforctr extends GXWebObjectStub
{
   public tforctr( )
   {
   }

   public tforctr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tforctr.class ));
   }

   public tforctr( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tforctr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tforctr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipo de Control";
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

