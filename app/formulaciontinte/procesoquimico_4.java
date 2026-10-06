package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.procesoquimico_4", "/app.formulaciontinte.procesoquimico_4"})
@jakarta.servlet.annotation.MultipartConfig
public final  class procesoquimico_4 extends GXWebObjectStub
{
   public procesoquimico_4( )
   {
   }

   public procesoquimico_4( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( procesoquimico_4.class ));
   }

   public procesoquimico_4( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new procesoquimico_4_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new procesoquimico_4_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Proceso Quimico (Lineas)";
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

