package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tetivlm", "/app.tetivlm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tetivlm extends GXWebObjectStub
{
   public tetivlm( )
   {
   }

   public tetivlm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tetivlm.class ));
   }

   public tetivlm( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tetivlm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tetivlm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ETIQUETAS CODIGOS";
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

