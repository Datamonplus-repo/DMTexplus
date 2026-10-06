package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxardtte", "/app.tvxardtte"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxardtte extends GXWebObjectStub
{
   public tvxardtte( )
   {
   }

   public tvxardtte( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxardtte.class ));
   }

   public tvxardtte( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxardtte_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxardtte_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla Artìculos/Datos Técnicos en Tejeduría";
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

