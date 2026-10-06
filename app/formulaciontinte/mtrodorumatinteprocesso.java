package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.mtrodorumatinteprocesso", "/app.formulaciontinte.mtrodorumatinteprocesso"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mtrodorumatinteprocesso extends GXWebObjectStub
{
   public mtrodorumatinteprocesso( )
   {
   }

   public mtrodorumatinteprocesso( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mtrodorumatinteprocesso.class ));
   }

   public mtrodorumatinteprocesso( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mtrodorumatinteprocesso_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mtrodorumatinteprocesso_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mto Formulas Tinte (Procesos)";
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

