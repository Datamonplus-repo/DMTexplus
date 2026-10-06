package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.versituacionfaseshdr", "/app.versituacionfaseshdr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class versituacionfaseshdr extends GXWebObjectStub
{
   public versituacionfaseshdr( )
   {
   }

   public versituacionfaseshdr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( versituacionfaseshdr.class ));
   }

   public versituacionfaseshdr( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new versituacionfaseshdr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new versituacionfaseshdr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ver Situacion Fases Hdr";
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

